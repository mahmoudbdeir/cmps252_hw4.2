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

@Tag("3")
class Record_1889 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1889: FirstName is George")
	void FirstNameOfRecord1889() {
		assertEquals("George", customers.get(1888).getFirstName());
	}

	@Test
	@DisplayName("Record 1889: LastName is Lampiasi")
	void LastNameOfRecord1889() {
		assertEquals("Lampiasi", customers.get(1888).getLastName());
	}

	@Test
	@DisplayName("Record 1889: Company is Grace Cafaro")
	void CompanyOfRecord1889() {
		assertEquals("Grace Cafaro", customers.get(1888).getCompany());
	}

	@Test
	@DisplayName("Record 1889: Address is 73 Ferry St")
	void AddressOfRecord1889() {
		assertEquals("73 Ferry St", customers.get(1888).getAddress());
	}

	@Test
	@DisplayName("Record 1889: City is Newark")
	void CityOfRecord1889() {
		assertEquals("Newark", customers.get(1888).getCity());
	}

	@Test
	@DisplayName("Record 1889: County is Essex")
	void CountyOfRecord1889() {
		assertEquals("Essex", customers.get(1888).getCounty());
	}

	@Test
	@DisplayName("Record 1889: State is NJ")
	void StateOfRecord1889() {
		assertEquals("NJ", customers.get(1888).getState());
	}

	@Test
	@DisplayName("Record 1889: ZIP is 7105")
	void ZIPOfRecord1889() {
		assertEquals("7105", customers.get(1888).getZIP());
	}

	@Test
	@DisplayName("Record 1889: Phone is 973-344-6543")
	void PhoneOfRecord1889() {
		assertEquals("973-344-6543", customers.get(1888).getPhone());
	}

	@Test
	@DisplayName("Record 1889: Fax is 973-344-2173")
	void FaxOfRecord1889() {
		assertEquals("973-344-2173", customers.get(1888).getFax());
	}

	@Test
	@DisplayName("Record 1889: Email is george@lampiasi.com")
	void EmailOfRecord1889() {
		assertEquals("george@lampiasi.com", customers.get(1888).getEmail());
	}

	@Test
	@DisplayName("Record 1889: Web is http://www.georgelampiasi.com")
	void WebOfRecord1889() {
		assertEquals("http://www.georgelampiasi.com", customers.get(1888).getWeb());
	}
}
