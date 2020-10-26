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

@Tag("10")
class Record_3820 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3820: FirstName is Alba")
	void FirstNameOfRecord3820() {
		assertEquals("Alba", customers.get(3819).getFirstName());
	}

	@Test
	@DisplayName("Record 3820: LastName is Fixari")
	void LastNameOfRecord3820() {
		assertEquals("Fixari", customers.get(3819).getLastName());
	}

	@Test
	@DisplayName("Record 3820: Company is Ontra Inc")
	void CompanyOfRecord3820() {
		assertEquals("Ontra Inc", customers.get(3819).getCompany());
	}

	@Test
	@DisplayName("Record 3820: Address is 1806 S Broad St")
	void AddressOfRecord3820() {
		assertEquals("1806 S Broad St", customers.get(3819).getAddress());
	}

	@Test
	@DisplayName("Record 3820: City is Trenton")
	void CityOfRecord3820() {
		assertEquals("Trenton", customers.get(3819).getCity());
	}

	@Test
	@DisplayName("Record 3820: County is Mercer")
	void CountyOfRecord3820() {
		assertEquals("Mercer", customers.get(3819).getCounty());
	}

	@Test
	@DisplayName("Record 3820: State is NJ")
	void StateOfRecord3820() {
		assertEquals("NJ", customers.get(3819).getState());
	}

	@Test
	@DisplayName("Record 3820: ZIP is 8610")
	void ZIPOfRecord3820() {
		assertEquals("8610", customers.get(3819).getZIP());
	}

	@Test
	@DisplayName("Record 3820: Phone is 609-392-2038")
	void PhoneOfRecord3820() {
		assertEquals("609-392-2038", customers.get(3819).getPhone());
	}

	@Test
	@DisplayName("Record 3820: Fax is 609-392-2594")
	void FaxOfRecord3820() {
		assertEquals("609-392-2594", customers.get(3819).getFax());
	}

	@Test
	@DisplayName("Record 3820: Email is alba@fixari.com")
	void EmailOfRecord3820() {
		assertEquals("alba@fixari.com", customers.get(3819).getEmail());
	}

	@Test
	@DisplayName("Record 3820: Web is http://www.albafixari.com")
	void WebOfRecord3820() {
		assertEquals("http://www.albafixari.com", customers.get(3819).getWeb());
	}
}
