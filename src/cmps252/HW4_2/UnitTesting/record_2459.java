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

@Tag("40")
class Record_2459 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2459: FirstName is Bertha")
	void FirstNameOfRecord2459() {
		assertEquals("Bertha", customers.get(2458).getFirstName());
	}

	@Test
	@DisplayName("Record 2459: LastName is Chruch")
	void LastNameOfRecord2459() {
		assertEquals("Chruch", customers.get(2458).getLastName());
	}

	@Test
	@DisplayName("Record 2459: Company is Mcpherson, Lisa Adrian Esq")
	void CompanyOfRecord2459() {
		assertEquals("Mcpherson, Lisa Adrian Esq", customers.get(2458).getCompany());
	}

	@Test
	@DisplayName("Record 2459: Address is 1064 Joliet St")
	void AddressOfRecord2459() {
		assertEquals("1064 Joliet St", customers.get(2458).getAddress());
	}

	@Test
	@DisplayName("Record 2459: City is Dyer")
	void CityOfRecord2459() {
		assertEquals("Dyer", customers.get(2458).getCity());
	}

	@Test
	@DisplayName("Record 2459: County is Lake")
	void CountyOfRecord2459() {
		assertEquals("Lake", customers.get(2458).getCounty());
	}

	@Test
	@DisplayName("Record 2459: State is IN")
	void StateOfRecord2459() {
		assertEquals("IN", customers.get(2458).getState());
	}

	@Test
	@DisplayName("Record 2459: ZIP is 46311")
	void ZIPOfRecord2459() {
		assertEquals("46311", customers.get(2458).getZIP());
	}

	@Test
	@DisplayName("Record 2459: Phone is 219-864-2116")
	void PhoneOfRecord2459() {
		assertEquals("219-864-2116", customers.get(2458).getPhone());
	}

	@Test
	@DisplayName("Record 2459: Fax is 219-864-5445")
	void FaxOfRecord2459() {
		assertEquals("219-864-5445", customers.get(2458).getFax());
	}

	@Test
	@DisplayName("Record 2459: Email is bertha@chruch.com")
	void EmailOfRecord2459() {
		assertEquals("bertha@chruch.com", customers.get(2458).getEmail());
	}

	@Test
	@DisplayName("Record 2459: Web is http://www.berthachruch.com")
	void WebOfRecord2459() {
		assertEquals("http://www.berthachruch.com", customers.get(2458).getWeb());
	}
}
