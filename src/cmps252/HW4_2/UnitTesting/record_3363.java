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

@Tag("4")
class Record_3363 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3363: FirstName is Whitney")
	void FirstNameOfRecord3363() {
		assertEquals("Whitney", customers.get(3362).getFirstName());
	}

	@Test
	@DisplayName("Record 3363: LastName is Dominique")
	void LastNameOfRecord3363() {
		assertEquals("Dominique", customers.get(3362).getLastName());
	}

	@Test
	@DisplayName("Record 3363: Company is Venard Lithographers Inc")
	void CompanyOfRecord3363() {
		assertEquals("Venard Lithographers Inc", customers.get(3362).getCompany());
	}

	@Test
	@DisplayName("Record 3363: Address is 30 Eventide Ln")
	void AddressOfRecord3363() {
		assertEquals("30 Eventide Ln", customers.get(3362).getAddress());
	}

	@Test
	@DisplayName("Record 3363: City is Levittown")
	void CityOfRecord3363() {
		assertEquals("Levittown", customers.get(3362).getCity());
	}

	@Test
	@DisplayName("Record 3363: County is Bucks")
	void CountyOfRecord3363() {
		assertEquals("Bucks", customers.get(3362).getCounty());
	}

	@Test
	@DisplayName("Record 3363: State is PA")
	void StateOfRecord3363() {
		assertEquals("PA", customers.get(3362).getState());
	}

	@Test
	@DisplayName("Record 3363: ZIP is 19054")
	void ZIPOfRecord3363() {
		assertEquals("19054", customers.get(3362).getZIP());
	}

	@Test
	@DisplayName("Record 3363: Phone is 215-949-8259")
	void PhoneOfRecord3363() {
		assertEquals("215-949-8259", customers.get(3362).getPhone());
	}

	@Test
	@DisplayName("Record 3363: Fax is 215-949-0347")
	void FaxOfRecord3363() {
		assertEquals("215-949-0347", customers.get(3362).getFax());
	}

	@Test
	@DisplayName("Record 3363: Email is whitney@dominique.com")
	void EmailOfRecord3363() {
		assertEquals("whitney@dominique.com", customers.get(3362).getEmail());
	}

	@Test
	@DisplayName("Record 3363: Web is http://www.whitneydominique.com")
	void WebOfRecord3363() {
		assertEquals("http://www.whitneydominique.com", customers.get(3362).getWeb());
	}
}
