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

@Tag("21")
class Record_1096 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1096: FirstName is Ernest")
	void FirstNameOfRecord1096() {
		assertEquals("Ernest", customers.get(1095).getFirstName());
	}

	@Test
	@DisplayName("Record 1096: LastName is Luzader")
	void LastNameOfRecord1096() {
		assertEquals("Luzader", customers.get(1095).getLastName());
	}

	@Test
	@DisplayName("Record 1096: Company is First Spice Mixing Co Inc")
	void CompanyOfRecord1096() {
		assertEquals("First Spice Mixing Co Inc", customers.get(1095).getCompany());
	}

	@Test
	@DisplayName("Record 1096: Address is 114 Church St")
	void AddressOfRecord1096() {
		assertEquals("114 Church St", customers.get(1095).getAddress());
	}

	@Test
	@DisplayName("Record 1096: City is Carthage")
	void CityOfRecord1096() {
		assertEquals("Carthage", customers.get(1095).getCity());
	}

	@Test
	@DisplayName("Record 1096: County is Jefferson")
	void CountyOfRecord1096() {
		assertEquals("Jefferson", customers.get(1095).getCounty());
	}

	@Test
	@DisplayName("Record 1096: State is NY")
	void StateOfRecord1096() {
		assertEquals("NY", customers.get(1095).getState());
	}

	@Test
	@DisplayName("Record 1096: ZIP is 13619")
	void ZIPOfRecord1096() {
		assertEquals("13619", customers.get(1095).getZIP());
	}

	@Test
	@DisplayName("Record 1096: Phone is 315-493-9605")
	void PhoneOfRecord1096() {
		assertEquals("315-493-9605", customers.get(1095).getPhone());
	}

	@Test
	@DisplayName("Record 1096: Fax is 315-493-1681")
	void FaxOfRecord1096() {
		assertEquals("315-493-1681", customers.get(1095).getFax());
	}

	@Test
	@DisplayName("Record 1096: Email is ernest@luzader.com")
	void EmailOfRecord1096() {
		assertEquals("ernest@luzader.com", customers.get(1095).getEmail());
	}

	@Test
	@DisplayName("Record 1096: Web is http://www.ernestluzader.com")
	void WebOfRecord1096() {
		assertEquals("http://www.ernestluzader.com", customers.get(1095).getWeb());
	}
}
