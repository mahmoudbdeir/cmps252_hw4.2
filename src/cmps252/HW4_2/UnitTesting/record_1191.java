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

@Tag("10")
class Record_1191 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1191: FirstName is Henry")
	void FirstNameOfRecord1191() {
		assertEquals("Henry", customers.get(1190).getFirstName());
	}

	@Test
	@DisplayName("Record 1191: LastName is Pouncy")
	void LastNameOfRecord1191() {
		assertEquals("Pouncy", customers.get(1190).getLastName());
	}

	@Test
	@DisplayName("Record 1191: Company is Hoy Printing Corp")
	void CompanyOfRecord1191() {
		assertEquals("Hoy Printing Corp", customers.get(1190).getCompany());
	}

	@Test
	@DisplayName("Record 1191: Address is 1327 Central Ave")
	void AddressOfRecord1191() {
		assertEquals("1327 Central Ave", customers.get(1190).getAddress());
	}

	@Test
	@DisplayName("Record 1191: City is Billings")
	void CityOfRecord1191() {
		assertEquals("Billings", customers.get(1190).getCity());
	}

	@Test
	@DisplayName("Record 1191: County is Yellowstone")
	void CountyOfRecord1191() {
		assertEquals("Yellowstone", customers.get(1190).getCounty());
	}

	@Test
	@DisplayName("Record 1191: State is MT")
	void StateOfRecord1191() {
		assertEquals("MT", customers.get(1190).getState());
	}

	@Test
	@DisplayName("Record 1191: ZIP is 59102")
	void ZIPOfRecord1191() {
		assertEquals("59102", customers.get(1190).getZIP());
	}

	@Test
	@DisplayName("Record 1191: Phone is 406-259-6229")
	void PhoneOfRecord1191() {
		assertEquals("406-259-6229", customers.get(1190).getPhone());
	}

	@Test
	@DisplayName("Record 1191: Fax is 406-259-7654")
	void FaxOfRecord1191() {
		assertEquals("406-259-7654", customers.get(1190).getFax());
	}

	@Test
	@DisplayName("Record 1191: Email is henry@pouncy.com")
	void EmailOfRecord1191() {
		assertEquals("henry@pouncy.com", customers.get(1190).getEmail());
	}

	@Test
	@DisplayName("Record 1191: Web is http://www.henrypouncy.com")
	void WebOfRecord1191() {
		assertEquals("http://www.henrypouncy.com", customers.get(1190).getWeb());
	}
}
