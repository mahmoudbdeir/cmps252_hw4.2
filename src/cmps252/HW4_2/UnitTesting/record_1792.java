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

@Tag("0")
class Record_1792 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1792: FirstName is Jami")
	void FirstNameOfRecord1792() {
		assertEquals("Jami", customers.get(1791).getFirstName());
	}

	@Test
	@DisplayName("Record 1792: LastName is Depippo")
	void LastNameOfRecord1792() {
		assertEquals("Depippo", customers.get(1791).getLastName());
	}

	@Test
	@DisplayName("Record 1792: Company is A & A Bail Bonds")
	void CompanyOfRecord1792() {
		assertEquals("A & A Bail Bonds", customers.get(1791).getCompany());
	}

	@Test
	@DisplayName("Record 1792: Address is 900 6th Ave Se")
	void AddressOfRecord1792() {
		assertEquals("900 6th Ave Se", customers.get(1791).getAddress());
	}

	@Test
	@DisplayName("Record 1792: City is Minneapolis")
	void CityOfRecord1792() {
		assertEquals("Minneapolis", customers.get(1791).getCity());
	}

	@Test
	@DisplayName("Record 1792: County is Hennepin")
	void CountyOfRecord1792() {
		assertEquals("Hennepin", customers.get(1791).getCounty());
	}

	@Test
	@DisplayName("Record 1792: State is MN")
	void StateOfRecord1792() {
		assertEquals("MN", customers.get(1791).getState());
	}

	@Test
	@DisplayName("Record 1792: ZIP is 55414")
	void ZIPOfRecord1792() {
		assertEquals("55414", customers.get(1791).getZIP());
	}

	@Test
	@DisplayName("Record 1792: Phone is 612-379-4232")
	void PhoneOfRecord1792() {
		assertEquals("612-379-4232", customers.get(1791).getPhone());
	}

	@Test
	@DisplayName("Record 1792: Fax is 612-379-8195")
	void FaxOfRecord1792() {
		assertEquals("612-379-8195", customers.get(1791).getFax());
	}

	@Test
	@DisplayName("Record 1792: Email is jami@depippo.com")
	void EmailOfRecord1792() {
		assertEquals("jami@depippo.com", customers.get(1791).getEmail());
	}

	@Test
	@DisplayName("Record 1792: Web is http://www.jamidepippo.com")
	void WebOfRecord1792() {
		assertEquals("http://www.jamidepippo.com", customers.get(1791).getWeb());
	}
}
