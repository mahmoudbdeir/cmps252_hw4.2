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

@Tag("33")
class Record_3227 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3227: FirstName is Louella")
	void FirstNameOfRecord3227() {
		assertEquals("Louella", customers.get(3226).getFirstName());
	}

	@Test
	@DisplayName("Record 3227: LastName is Koor")
	void LastNameOfRecord3227() {
		assertEquals("Koor", customers.get(3226).getLastName());
	}

	@Test
	@DisplayName("Record 3227: Company is Hardaway Law Firm Pa")
	void CompanyOfRecord3227() {
		assertEquals("Hardaway Law Firm Pa", customers.get(3226).getCompany());
	}

	@Test
	@DisplayName("Record 3227: Address is 3021 Cullerton St")
	void AddressOfRecord3227() {
		assertEquals("3021 Cullerton St", customers.get(3226).getAddress());
	}

	@Test
	@DisplayName("Record 3227: City is Franklin Park")
	void CityOfRecord3227() {
		assertEquals("Franklin Park", customers.get(3226).getCity());
	}

	@Test
	@DisplayName("Record 3227: County is Cook")
	void CountyOfRecord3227() {
		assertEquals("Cook", customers.get(3226).getCounty());
	}

	@Test
	@DisplayName("Record 3227: State is IL")
	void StateOfRecord3227() {
		assertEquals("IL", customers.get(3226).getState());
	}

	@Test
	@DisplayName("Record 3227: ZIP is 60131")
	void ZIPOfRecord3227() {
		assertEquals("60131", customers.get(3226).getZIP());
	}

	@Test
	@DisplayName("Record 3227: Phone is 847-455-8782")
	void PhoneOfRecord3227() {
		assertEquals("847-455-8782", customers.get(3226).getPhone());
	}

	@Test
	@DisplayName("Record 3227: Fax is 847-455-9172")
	void FaxOfRecord3227() {
		assertEquals("847-455-9172", customers.get(3226).getFax());
	}

	@Test
	@DisplayName("Record 3227: Email is louella@koor.com")
	void EmailOfRecord3227() {
		assertEquals("louella@koor.com", customers.get(3226).getEmail());
	}

	@Test
	@DisplayName("Record 3227: Web is http://www.louellakoor.com")
	void WebOfRecord3227() {
		assertEquals("http://www.louellakoor.com", customers.get(3226).getWeb());
	}
}
