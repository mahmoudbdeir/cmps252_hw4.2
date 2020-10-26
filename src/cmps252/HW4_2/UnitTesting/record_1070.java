package cmps252.HW4_2.UnitTesting;

import static org.junit.jupiter.api.Assertions.*;
import java.io.FileNotFoundException;
import java.util.List;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import cmps252.HW4_2.Customer;
import cmps252.HW4_2.FileParser;

@Tag("30")
class Record_1070 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1070: FirstName is Johnnie")
	void FirstNameOfRecord1070() {
		assertEquals("Johnnie", customers.get(1069).getFirstName());
	}

	@Test
	@DisplayName("Record 1070: LastName is Stant")
	void LastNameOfRecord1070() {
		assertEquals("Stant", customers.get(1069).getLastName());
	}

	@Test
	@DisplayName("Record 1070: Company is Baker Hughes Inteq")
	void CompanyOfRecord1070() {
		assertEquals("Baker Hughes Inteq", customers.get(1069).getCompany());
	}

	@Test
	@DisplayName("Record 1070: Address is 1821 W Allen St")
	void AddressOfRecord1070() {
		assertEquals("1821 W Allen St", customers.get(1069).getAddress());
	}

	@Test
	@DisplayName("Record 1070: City is Allentown")
	void CityOfRecord1070() {
		assertEquals("Allentown", customers.get(1069).getCity());
	}

	@Test
	@DisplayName("Record 1070: County is Lehigh")
	void CountyOfRecord1070() {
		assertEquals("Lehigh", customers.get(1069).getCounty());
	}

	@Test
	@DisplayName("Record 1070: State is PA")
	void StateOfRecord1070() {
		assertEquals("PA", customers.get(1069).getState());
	}

	@Test
	@DisplayName("Record 1070: ZIP is 18104")
	void ZIPOfRecord1070() {
		assertEquals("18104", customers.get(1069).getZIP());
	}

	@Test
	@DisplayName("Record 1070: Phone is 610-435-3674")
	void PhoneOfRecord1070() {
		assertEquals("610-435-3674", customers.get(1069).getPhone());
	}

	@Test
	@DisplayName("Record 1070: Fax is 610-435-7032")
	void FaxOfRecord1070() {
		assertEquals("610-435-7032", customers.get(1069).getFax());
	}

	@Test
	@DisplayName("Record 1070: Email is johnnie@stant.com")
	void EmailOfRecord1070() {
		assertEquals("johnnie@stant.com", customers.get(1069).getEmail());
	}

	@Test
	@DisplayName("Record 1070: Web is http://www.johnniestant.com")
	void WebOfRecord1070() {
		assertEquals("http://www.johnniestant.com", customers.get(1069).getWeb());
	}
}
