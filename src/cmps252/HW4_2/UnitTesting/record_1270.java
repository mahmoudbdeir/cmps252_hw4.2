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

@Tag("23")
class Record_1270 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1270: FirstName is Stefanie")
	void FirstNameOfRecord1270() {
		assertEquals("Stefanie", customers.get(1269).getFirstName());
	}

	@Test
	@DisplayName("Record 1270: LastName is Prysser")
	void LastNameOfRecord1270() {
		assertEquals("Prysser", customers.get(1269).getLastName());
	}

	@Test
	@DisplayName("Record 1270: Company is Harris Publications Inc")
	void CompanyOfRecord1270() {
		assertEquals("Harris Publications Inc", customers.get(1269).getCompany());
	}

	@Test
	@DisplayName("Record 1270: Address is 9995 I St")
	void AddressOfRecord1270() {
		assertEquals("9995 I St", customers.get(1269).getAddress());
	}

	@Test
	@DisplayName("Record 1270: City is Omaha")
	void CityOfRecord1270() {
		assertEquals("Omaha", customers.get(1269).getCity());
	}

	@Test
	@DisplayName("Record 1270: County is Douglas")
	void CountyOfRecord1270() {
		assertEquals("Douglas", customers.get(1269).getCounty());
	}

	@Test
	@DisplayName("Record 1270: State is NE")
	void StateOfRecord1270() {
		assertEquals("NE", customers.get(1269).getState());
	}

	@Test
	@DisplayName("Record 1270: ZIP is 68127")
	void ZIPOfRecord1270() {
		assertEquals("68127", customers.get(1269).getZIP());
	}

	@Test
	@DisplayName("Record 1270: Phone is 402-339-9697")
	void PhoneOfRecord1270() {
		assertEquals("402-339-9697", customers.get(1269).getPhone());
	}

	@Test
	@DisplayName("Record 1270: Fax is 402-339-3967")
	void FaxOfRecord1270() {
		assertEquals("402-339-3967", customers.get(1269).getFax());
	}

	@Test
	@DisplayName("Record 1270: Email is stefanie@prysser.com")
	void EmailOfRecord1270() {
		assertEquals("stefanie@prysser.com", customers.get(1269).getEmail());
	}

	@Test
	@DisplayName("Record 1270: Web is http://www.stefanieprysser.com")
	void WebOfRecord1270() {
		assertEquals("http://www.stefanieprysser.com", customers.get(1269).getWeb());
	}
}
