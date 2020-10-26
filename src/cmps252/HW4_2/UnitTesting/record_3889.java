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

@Tag("45")
class Record_3889 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3889: FirstName is Sadie")
	void FirstNameOfRecord3889() {
		assertEquals("Sadie", customers.get(3888).getFirstName());
	}

	@Test
	@DisplayName("Record 3889: LastName is Fantroy")
	void LastNameOfRecord3889() {
		assertEquals("Fantroy", customers.get(3888).getLastName());
	}

	@Test
	@DisplayName("Record 3889: Company is Pryor, Samuel R Esq")
	void CompanyOfRecord3889() {
		assertEquals("Pryor, Samuel R Esq", customers.get(3888).getCompany());
	}

	@Test
	@DisplayName("Record 3889: Address is 211 N Robinson Ave  #-600")
	void AddressOfRecord3889() {
		assertEquals("211 N Robinson Ave  #-600", customers.get(3888).getAddress());
	}

	@Test
	@DisplayName("Record 3889: City is Oklahoma City")
	void CityOfRecord3889() {
		assertEquals("Oklahoma City", customers.get(3888).getCity());
	}

	@Test
	@DisplayName("Record 3889: County is Oklahoma")
	void CountyOfRecord3889() {
		assertEquals("Oklahoma", customers.get(3888).getCounty());
	}

	@Test
	@DisplayName("Record 3889: State is OK")
	void StateOfRecord3889() {
		assertEquals("OK", customers.get(3888).getState());
	}

	@Test
	@DisplayName("Record 3889: ZIP is 73102")
	void ZIPOfRecord3889() {
		assertEquals("73102", customers.get(3888).getZIP());
	}

	@Test
	@DisplayName("Record 3889: Phone is 405-272-2497")
	void PhoneOfRecord3889() {
		assertEquals("405-272-2497", customers.get(3888).getPhone());
	}

	@Test
	@DisplayName("Record 3889: Fax is 405-272-5706")
	void FaxOfRecord3889() {
		assertEquals("405-272-5706", customers.get(3888).getFax());
	}

	@Test
	@DisplayName("Record 3889: Email is sadie@fantroy.com")
	void EmailOfRecord3889() {
		assertEquals("sadie@fantroy.com", customers.get(3888).getEmail());
	}

	@Test
	@DisplayName("Record 3889: Web is http://www.sadiefantroy.com")
	void WebOfRecord3889() {
		assertEquals("http://www.sadiefantroy.com", customers.get(3888).getWeb());
	}
}
