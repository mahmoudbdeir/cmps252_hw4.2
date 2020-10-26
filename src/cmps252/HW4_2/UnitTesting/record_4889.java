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

@Tag("31")
class Record_4889 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4889: FirstName is Terrence")
	void FirstNameOfRecord4889() {
		assertEquals("Terrence", customers.get(4888).getFirstName());
	}

	@Test
	@DisplayName("Record 4889: LastName is Merrill")
	void LastNameOfRecord4889() {
		assertEquals("Merrill", customers.get(4888).getLastName());
	}

	@Test
	@DisplayName("Record 4889: Company is Whyte Hirschboeck Dudek Sc")
	void CompanyOfRecord4889() {
		assertEquals("Whyte Hirschboeck Dudek Sc", customers.get(4888).getCompany());
	}

	@Test
	@DisplayName("Record 4889: Address is 5300 Stevens Creek Blvd  #-50")
	void AddressOfRecord4889() {
		assertEquals("5300 Stevens Creek Blvd  #-50", customers.get(4888).getAddress());
	}

	@Test
	@DisplayName("Record 4889: City is San Jose")
	void CityOfRecord4889() {
		assertEquals("San Jose", customers.get(4888).getCity());
	}

	@Test
	@DisplayName("Record 4889: County is Santa Clara")
	void CountyOfRecord4889() {
		assertEquals("Santa Clara", customers.get(4888).getCounty());
	}

	@Test
	@DisplayName("Record 4889: State is CA")
	void StateOfRecord4889() {
		assertEquals("CA", customers.get(4888).getState());
	}

	@Test
	@DisplayName("Record 4889: ZIP is 95129")
	void ZIPOfRecord4889() {
		assertEquals("95129", customers.get(4888).getZIP());
	}

	@Test
	@DisplayName("Record 4889: Phone is 408-246-3660")
	void PhoneOfRecord4889() {
		assertEquals("408-246-3660", customers.get(4888).getPhone());
	}

	@Test
	@DisplayName("Record 4889: Fax is 408-246-8192")
	void FaxOfRecord4889() {
		assertEquals("408-246-8192", customers.get(4888).getFax());
	}

	@Test
	@DisplayName("Record 4889: Email is terrence@merrill.com")
	void EmailOfRecord4889() {
		assertEquals("terrence@merrill.com", customers.get(4888).getEmail());
	}

	@Test
	@DisplayName("Record 4889: Web is http://www.terrencemerrill.com")
	void WebOfRecord4889() {
		assertEquals("http://www.terrencemerrill.com", customers.get(4888).getWeb());
	}
}
