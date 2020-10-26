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

@Tag("18")
class Record_785 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 785: FirstName is Mildred")
	void FirstNameOfRecord785() {
		assertEquals("Mildred", customers.get(784).getFirstName());
	}

	@Test
	@DisplayName("Record 785: LastName is Coody")
	void LastNameOfRecord785() {
		assertEquals("Coody", customers.get(784).getLastName());
	}

	@Test
	@DisplayName("Record 785: Company is Hession, Joseph F Esq")
	void CompanyOfRecord785() {
		assertEquals("Hession, Joseph F Esq", customers.get(784).getCompany());
	}

	@Test
	@DisplayName("Record 785: Address is 932 Dorchester Ave")
	void AddressOfRecord785() {
		assertEquals("932 Dorchester Ave", customers.get(784).getAddress());
	}

	@Test
	@DisplayName("Record 785: City is Boston")
	void CityOfRecord785() {
		assertEquals("Boston", customers.get(784).getCity());
	}

	@Test
	@DisplayName("Record 785: County is Suffolk")
	void CountyOfRecord785() {
		assertEquals("Suffolk", customers.get(784).getCounty());
	}

	@Test
	@DisplayName("Record 785: State is MA")
	void StateOfRecord785() {
		assertEquals("MA", customers.get(784).getState());
	}

	@Test
	@DisplayName("Record 785: ZIP is 2125")
	void ZIPOfRecord785() {
		assertEquals("2125", customers.get(784).getZIP());
	}

	@Test
	@DisplayName("Record 785: Phone is 617-287-0624")
	void PhoneOfRecord785() {
		assertEquals("617-287-0624", customers.get(784).getPhone());
	}

	@Test
	@DisplayName("Record 785: Fax is 617-287-9128")
	void FaxOfRecord785() {
		assertEquals("617-287-9128", customers.get(784).getFax());
	}

	@Test
	@DisplayName("Record 785: Email is mildred@coody.com")
	void EmailOfRecord785() {
		assertEquals("mildred@coody.com", customers.get(784).getEmail());
	}

	@Test
	@DisplayName("Record 785: Web is http://www.mildredcoody.com")
	void WebOfRecord785() {
		assertEquals("http://www.mildredcoody.com", customers.get(784).getWeb());
	}
}
