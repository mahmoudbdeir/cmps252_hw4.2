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
class Record_1687 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1687: FirstName is Elinor")
	void FirstNameOfRecord1687() {
		assertEquals("Elinor", customers.get(1686).getFirstName());
	}

	@Test
	@DisplayName("Record 1687: LastName is Tygen")
	void LastNameOfRecord1687() {
		assertEquals("Tygen", customers.get(1686).getLastName());
	}

	@Test
	@DisplayName("Record 1687: Company is Jacobs, Lawrence S Esq")
	void CompanyOfRecord1687() {
		assertEquals("Jacobs, Lawrence S Esq", customers.get(1686).getCompany());
	}

	@Test
	@DisplayName("Record 1687: Address is Rd 2")
	void AddressOfRecord1687() {
		assertEquals("Rd 2", customers.get(1686).getAddress());
	}

	@Test
	@DisplayName("Record 1687: City is Indiana")
	void CityOfRecord1687() {
		assertEquals("Indiana", customers.get(1686).getCity());
	}

	@Test
	@DisplayName("Record 1687: County is Indiana")
	void CountyOfRecord1687() {
		assertEquals("Indiana", customers.get(1686).getCounty());
	}

	@Test
	@DisplayName("Record 1687: State is PA")
	void StateOfRecord1687() {
		assertEquals("PA", customers.get(1686).getState());
	}

	@Test
	@DisplayName("Record 1687: ZIP is 15701")
	void ZIPOfRecord1687() {
		assertEquals("15701", customers.get(1686).getZIP());
	}

	@Test
	@DisplayName("Record 1687: Phone is 724-463-5982")
	void PhoneOfRecord1687() {
		assertEquals("724-463-5982", customers.get(1686).getPhone());
	}

	@Test
	@DisplayName("Record 1687: Fax is 724-463-1601")
	void FaxOfRecord1687() {
		assertEquals("724-463-1601", customers.get(1686).getFax());
	}

	@Test
	@DisplayName("Record 1687: Email is elinor@tygen.com")
	void EmailOfRecord1687() {
		assertEquals("elinor@tygen.com", customers.get(1686).getEmail());
	}

	@Test
	@DisplayName("Record 1687: Web is http://www.elinortygen.com")
	void WebOfRecord1687() {
		assertEquals("http://www.elinortygen.com", customers.get(1686).getWeb());
	}
}
