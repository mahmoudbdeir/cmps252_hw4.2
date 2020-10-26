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

@Tag("19")
class Record_2858 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2858: FirstName is Billy")
	void FirstNameOfRecord2858() {
		assertEquals("Billy", customers.get(2857).getFirstName());
	}

	@Test
	@DisplayName("Record 2858: LastName is Treves")
	void LastNameOfRecord2858() {
		assertEquals("Treves", customers.get(2857).getLastName());
	}

	@Test
	@DisplayName("Record 2858: Company is Herada, Mitchell T Esq")
	void CompanyOfRecord2858() {
		assertEquals("Herada, Mitchell T Esq", customers.get(2857).getCompany());
	}

	@Test
	@DisplayName("Record 2858: Address is 329 W Main St")
	void AddressOfRecord2858() {
		assertEquals("329 W Main St", customers.get(2857).getAddress());
	}

	@Test
	@DisplayName("Record 2858: City is Hyannis")
	void CityOfRecord2858() {
		assertEquals("Hyannis", customers.get(2857).getCity());
	}

	@Test
	@DisplayName("Record 2858: County is Barnstable")
	void CountyOfRecord2858() {
		assertEquals("Barnstable", customers.get(2857).getCounty());
	}

	@Test
	@DisplayName("Record 2858: State is MA")
	void StateOfRecord2858() {
		assertEquals("MA", customers.get(2857).getState());
	}

	@Test
	@DisplayName("Record 2858: ZIP is 2601")
	void ZIPOfRecord2858() {
		assertEquals("2601", customers.get(2857).getZIP());
	}

	@Test
	@DisplayName("Record 2858: Phone is 508-771-0184")
	void PhoneOfRecord2858() {
		assertEquals("508-771-0184", customers.get(2857).getPhone());
	}

	@Test
	@DisplayName("Record 2858: Fax is 508-771-6264")
	void FaxOfRecord2858() {
		assertEquals("508-771-6264", customers.get(2857).getFax());
	}

	@Test
	@DisplayName("Record 2858: Email is billy@treves.com")
	void EmailOfRecord2858() {
		assertEquals("billy@treves.com", customers.get(2857).getEmail());
	}

	@Test
	@DisplayName("Record 2858: Web is http://www.billytreves.com")
	void WebOfRecord2858() {
		assertEquals("http://www.billytreves.com", customers.get(2857).getWeb());
	}
}
