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

@Tag("30")
class Record_1427 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1427: FirstName is Dana")
	void FirstNameOfRecord1427() {
		assertEquals("Dana", customers.get(1426).getFirstName());
	}

	@Test
	@DisplayName("Record 1427: LastName is Przepiora")
	void LastNameOfRecord1427() {
		assertEquals("Przepiora", customers.get(1426).getLastName());
	}

	@Test
	@DisplayName("Record 1427: Company is Gray, Karen Esq")
	void CompanyOfRecord1427() {
		assertEquals("Gray, Karen Esq", customers.get(1426).getCompany());
	}

	@Test
	@DisplayName("Record 1427: Address is 1117 N Solano Dr")
	void AddressOfRecord1427() {
		assertEquals("1117 N Solano Dr", customers.get(1426).getAddress());
	}

	@Test
	@DisplayName("Record 1427: City is Las Cruces")
	void CityOfRecord1427() {
		assertEquals("Las Cruces", customers.get(1426).getCity());
	}

	@Test
	@DisplayName("Record 1427: County is Dona Ana")
	void CountyOfRecord1427() {
		assertEquals("Dona Ana", customers.get(1426).getCounty());
	}

	@Test
	@DisplayName("Record 1427: State is NM")
	void StateOfRecord1427() {
		assertEquals("NM", customers.get(1426).getState());
	}

	@Test
	@DisplayName("Record 1427: ZIP is 88001")
	void ZIPOfRecord1427() {
		assertEquals("88001", customers.get(1426).getZIP());
	}

	@Test
	@DisplayName("Record 1427: Phone is 505-527-4815")
	void PhoneOfRecord1427() {
		assertEquals("505-527-4815", customers.get(1426).getPhone());
	}

	@Test
	@DisplayName("Record 1427: Fax is 505-527-5155")
	void FaxOfRecord1427() {
		assertEquals("505-527-5155", customers.get(1426).getFax());
	}

	@Test
	@DisplayName("Record 1427: Email is dana@przepiora.com")
	void EmailOfRecord1427() {
		assertEquals("dana@przepiora.com", customers.get(1426).getEmail());
	}

	@Test
	@DisplayName("Record 1427: Web is http://www.danaprzepiora.com")
	void WebOfRecord1427() {
		assertEquals("http://www.danaprzepiora.com", customers.get(1426).getWeb());
	}
}
