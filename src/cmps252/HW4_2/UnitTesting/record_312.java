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

@Tag("20")
class Record_312 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 312: FirstName is Kathryn")
	void FirstNameOfRecord312() {
		assertEquals("Kathryn", customers.get(311).getFirstName());
	}

	@Test
	@DisplayName("Record 312: LastName is Strough")
	void LastNameOfRecord312() {
		assertEquals("Strough", customers.get(311).getLastName());
	}

	@Test
	@DisplayName("Record 312: Company is Jackson Solicitor")
	void CompanyOfRecord312() {
		assertEquals("Jackson Solicitor", customers.get(311).getCompany());
	}

	@Test
	@DisplayName("Record 312: Address is 2726 Gunnison St")
	void AddressOfRecord312() {
		assertEquals("2726 Gunnison St", customers.get(311).getAddress());
	}

	@Test
	@DisplayName("Record 312: City is Colorado Springs")
	void CityOfRecord312() {
		assertEquals("Colorado Springs", customers.get(311).getCity());
	}

	@Test
	@DisplayName("Record 312: County is El Paso")
	void CountyOfRecord312() {
		assertEquals("El Paso", customers.get(311).getCounty());
	}

	@Test
	@DisplayName("Record 312: State is CO")
	void StateOfRecord312() {
		assertEquals("CO", customers.get(311).getState());
	}

	@Test
	@DisplayName("Record 312: ZIP is 80909")
	void ZIPOfRecord312() {
		assertEquals("80909", customers.get(311).getZIP());
	}

	@Test
	@DisplayName("Record 312: Phone is 719-634-5584")
	void PhoneOfRecord312() {
		assertEquals("719-634-5584", customers.get(311).getPhone());
	}

	@Test
	@DisplayName("Record 312: Fax is 719-634-6127")
	void FaxOfRecord312() {
		assertEquals("719-634-6127", customers.get(311).getFax());
	}

	@Test
	@DisplayName("Record 312: Email is kathryn@strough.com")
	void EmailOfRecord312() {
		assertEquals("kathryn@strough.com", customers.get(311).getEmail());
	}

	@Test
	@DisplayName("Record 312: Web is http://www.kathrynstrough.com")
	void WebOfRecord312() {
		assertEquals("http://www.kathrynstrough.com", customers.get(311).getWeb());
	}
}
