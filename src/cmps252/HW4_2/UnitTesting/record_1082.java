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

@Tag("27")
class Record_1082 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1082: FirstName is Omer")
	void FirstNameOfRecord1082() {
		assertEquals("Omer", customers.get(1081).getFirstName());
	}

	@Test
	@DisplayName("Record 1082: LastName is Rotering")
	void LastNameOfRecord1082() {
		assertEquals("Rotering", customers.get(1081).getLastName());
	}

	@Test
	@DisplayName("Record 1082: Company is Sailor Plastics Inc")
	void CompanyOfRecord1082() {
		assertEquals("Sailor Plastics Inc", customers.get(1081).getCompany());
	}

	@Test
	@DisplayName("Record 1082: Address is 1320 Light St")
	void AddressOfRecord1082() {
		assertEquals("1320 Light St", customers.get(1081).getAddress());
	}

	@Test
	@DisplayName("Record 1082: City is Baltimore")
	void CityOfRecord1082() {
		assertEquals("Baltimore", customers.get(1081).getCity());
	}

	@Test
	@DisplayName("Record 1082: County is Baltimore City")
	void CountyOfRecord1082() {
		assertEquals("Baltimore City", customers.get(1081).getCounty());
	}

	@Test
	@DisplayName("Record 1082: State is MD")
	void StateOfRecord1082() {
		assertEquals("MD", customers.get(1081).getState());
	}

	@Test
	@DisplayName("Record 1082: ZIP is 21230")
	void ZIPOfRecord1082() {
		assertEquals("21230", customers.get(1081).getZIP());
	}

	@Test
	@DisplayName("Record 1082: Phone is 410-727-3130")
	void PhoneOfRecord1082() {
		assertEquals("410-727-3130", customers.get(1081).getPhone());
	}

	@Test
	@DisplayName("Record 1082: Fax is 410-727-3026")
	void FaxOfRecord1082() {
		assertEquals("410-727-3026", customers.get(1081).getFax());
	}

	@Test
	@DisplayName("Record 1082: Email is omer@rotering.com")
	void EmailOfRecord1082() {
		assertEquals("omer@rotering.com", customers.get(1081).getEmail());
	}

	@Test
	@DisplayName("Record 1082: Web is http://www.omerrotering.com")
	void WebOfRecord1082() {
		assertEquals("http://www.omerrotering.com", customers.get(1081).getWeb());
	}
}
