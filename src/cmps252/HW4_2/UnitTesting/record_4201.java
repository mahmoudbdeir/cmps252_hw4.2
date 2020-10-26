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

@Tag("22")
class Record_4201 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4201: FirstName is Solomon")
	void FirstNameOfRecord4201() {
		assertEquals("Solomon", customers.get(4200).getFirstName());
	}

	@Test
	@DisplayName("Record 4201: LastName is Handcock")
	void LastNameOfRecord4201() {
		assertEquals("Handcock", customers.get(4200).getLastName());
	}

	@Test
	@DisplayName("Record 4201: Company is Polyglot International")
	void CompanyOfRecord4201() {
		assertEquals("Polyglot International", customers.get(4200).getCompany());
	}

	@Test
	@DisplayName("Record 4201: Address is 603 S Washington Ave")
	void AddressOfRecord4201() {
		assertEquals("603 S Washington Ave", customers.get(4200).getAddress());
	}

	@Test
	@DisplayName("Record 4201: City is Lansing")
	void CityOfRecord4201() {
		assertEquals("Lansing", customers.get(4200).getCity());
	}

	@Test
	@DisplayName("Record 4201: County is Ingham")
	void CountyOfRecord4201() {
		assertEquals("Ingham", customers.get(4200).getCounty());
	}

	@Test
	@DisplayName("Record 4201: State is MI")
	void StateOfRecord4201() {
		assertEquals("MI", customers.get(4200).getState());
	}

	@Test
	@DisplayName("Record 4201: ZIP is 48933")
	void ZIPOfRecord4201() {
		assertEquals("48933", customers.get(4200).getZIP());
	}

	@Test
	@DisplayName("Record 4201: Phone is 517-372-6422")
	void PhoneOfRecord4201() {
		assertEquals("517-372-6422", customers.get(4200).getPhone());
	}

	@Test
	@DisplayName("Record 4201: Fax is 517-372-8915")
	void FaxOfRecord4201() {
		assertEquals("517-372-8915", customers.get(4200).getFax());
	}

	@Test
	@DisplayName("Record 4201: Email is solomon@handcock.com")
	void EmailOfRecord4201() {
		assertEquals("solomon@handcock.com", customers.get(4200).getEmail());
	}

	@Test
	@DisplayName("Record 4201: Web is http://www.solomonhandcock.com")
	void WebOfRecord4201() {
		assertEquals("http://www.solomonhandcock.com", customers.get(4200).getWeb());
	}
}
