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

@Tag("12")
class Record_910 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 910: FirstName is Gale")
	void FirstNameOfRecord910() {
		assertEquals("Gale", customers.get(909).getFirstName());
	}

	@Test
	@DisplayName("Record 910: LastName is Cutchin")
	void LastNameOfRecord910() {
		assertEquals("Cutchin", customers.get(909).getLastName());
	}

	@Test
	@DisplayName("Record 910: Company is Mahan Western Industries Inc")
	void CompanyOfRecord910() {
		assertEquals("Mahan Western Industries Inc", customers.get(909).getCompany());
	}

	@Test
	@DisplayName("Record 910: Address is 707 5th St W")
	void AddressOfRecord910() {
		assertEquals("707 5th St W", customers.get(909).getAddress());
	}

	@Test
	@DisplayName("Record 910: City is Billings")
	void CityOfRecord910() {
		assertEquals("Billings", customers.get(909).getCity());
	}

	@Test
	@DisplayName("Record 910: County is Yellowstone")
	void CountyOfRecord910() {
		assertEquals("Yellowstone", customers.get(909).getCounty());
	}

	@Test
	@DisplayName("Record 910: State is MT")
	void StateOfRecord910() {
		assertEquals("MT", customers.get(909).getState());
	}

	@Test
	@DisplayName("Record 910: ZIP is 59101")
	void ZIPOfRecord910() {
		assertEquals("59101", customers.get(909).getZIP());
	}

	@Test
	@DisplayName("Record 910: Phone is 406-252-9221")
	void PhoneOfRecord910() {
		assertEquals("406-252-9221", customers.get(909).getPhone());
	}

	@Test
	@DisplayName("Record 910: Fax is 406-252-0061")
	void FaxOfRecord910() {
		assertEquals("406-252-0061", customers.get(909).getFax());
	}

	@Test
	@DisplayName("Record 910: Email is gale@cutchin.com")
	void EmailOfRecord910() {
		assertEquals("gale@cutchin.com", customers.get(909).getEmail());
	}

	@Test
	@DisplayName("Record 910: Web is http://www.galecutchin.com")
	void WebOfRecord910() {
		assertEquals("http://www.galecutchin.com", customers.get(909).getWeb());
	}
}
