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

@Tag("34")
class Record_4031 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4031: FirstName is Katharine")
	void FirstNameOfRecord4031() {
		assertEquals("Katharine", customers.get(4030).getFirstName());
	}

	@Test
	@DisplayName("Record 4031: LastName is Kiser")
	void LastNameOfRecord4031() {
		assertEquals("Kiser", customers.get(4030).getLastName());
	}

	@Test
	@DisplayName("Record 4031: Company is Radios Knobs Speakers & Things")
	void CompanyOfRecord4031() {
		assertEquals("Radios Knobs Speakers & Things", customers.get(4030).getCompany());
	}

	@Test
	@DisplayName("Record 4031: Address is 5605 Monroe St")
	void AddressOfRecord4031() {
		assertEquals("5605 Monroe St", customers.get(4030).getAddress());
	}

	@Test
	@DisplayName("Record 4031: City is Sylvania")
	void CityOfRecord4031() {
		assertEquals("Sylvania", customers.get(4030).getCity());
	}

	@Test
	@DisplayName("Record 4031: County is Lucas")
	void CountyOfRecord4031() {
		assertEquals("Lucas", customers.get(4030).getCounty());
	}

	@Test
	@DisplayName("Record 4031: State is OH")
	void StateOfRecord4031() {
		assertEquals("OH", customers.get(4030).getState());
	}

	@Test
	@DisplayName("Record 4031: ZIP is 43560")
	void ZIPOfRecord4031() {
		assertEquals("43560", customers.get(4030).getZIP());
	}

	@Test
	@DisplayName("Record 4031: Phone is 419-882-1869")
	void PhoneOfRecord4031() {
		assertEquals("419-882-1869", customers.get(4030).getPhone());
	}

	@Test
	@DisplayName("Record 4031: Fax is 419-882-8599")
	void FaxOfRecord4031() {
		assertEquals("419-882-8599", customers.get(4030).getFax());
	}

	@Test
	@DisplayName("Record 4031: Email is katharine@kiser.com")
	void EmailOfRecord4031() {
		assertEquals("katharine@kiser.com", customers.get(4030).getEmail());
	}

	@Test
	@DisplayName("Record 4031: Web is http://www.katharinekiser.com")
	void WebOfRecord4031() {
		assertEquals("http://www.katharinekiser.com", customers.get(4030).getWeb());
	}
}
