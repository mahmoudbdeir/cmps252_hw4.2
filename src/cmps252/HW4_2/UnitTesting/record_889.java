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

@Tag("36")
class Record_889 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 889: FirstName is Donnell")
	void FirstNameOfRecord889() {
		assertEquals("Donnell", customers.get(888).getFirstName());
	}

	@Test
	@DisplayName("Record 889: LastName is Novi")
	void LastNameOfRecord889() {
		assertEquals("Novi", customers.get(888).getLastName());
	}

	@Test
	@DisplayName("Record 889: Company is Smith Brook Mc Cray Pc")
	void CompanyOfRecord889() {
		assertEquals("Smith Brook Mc Cray Pc", customers.get(888).getCompany());
	}

	@Test
	@DisplayName("Record 889: Address is 6414 Copps Ave  #-m119")
	void AddressOfRecord889() {
		assertEquals("6414 Copps Ave  #-m119", customers.get(888).getAddress());
	}

	@Test
	@DisplayName("Record 889: City is Madison")
	void CityOfRecord889() {
		assertEquals("Madison", customers.get(888).getCity());
	}

	@Test
	@DisplayName("Record 889: County is Dane")
	void CountyOfRecord889() {
		assertEquals("Dane", customers.get(888).getCounty());
	}

	@Test
	@DisplayName("Record 889: State is WI")
	void StateOfRecord889() {
		assertEquals("WI", customers.get(888).getState());
	}

	@Test
	@DisplayName("Record 889: ZIP is 53716")
	void ZIPOfRecord889() {
		assertEquals("53716", customers.get(888).getZIP());
	}

	@Test
	@DisplayName("Record 889: Phone is 608-223-9732")
	void PhoneOfRecord889() {
		assertEquals("608-223-9732", customers.get(888).getPhone());
	}

	@Test
	@DisplayName("Record 889: Fax is 608-223-7496")
	void FaxOfRecord889() {
		assertEquals("608-223-7496", customers.get(888).getFax());
	}

	@Test
	@DisplayName("Record 889: Email is donnell@novi.com")
	void EmailOfRecord889() {
		assertEquals("donnell@novi.com", customers.get(888).getEmail());
	}

	@Test
	@DisplayName("Record 889: Web is http://www.donnellnovi.com")
	void WebOfRecord889() {
		assertEquals("http://www.donnellnovi.com", customers.get(888).getWeb());
	}
}
