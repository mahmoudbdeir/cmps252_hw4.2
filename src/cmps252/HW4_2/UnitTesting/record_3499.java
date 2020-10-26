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

@Tag("48")
class Record_3499 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3499: FirstName is Valeria")
	void FirstNameOfRecord3499() {
		assertEquals("Valeria", customers.get(3498).getFirstName());
	}

	@Test
	@DisplayName("Record 3499: LastName is Schwent")
	void LastNameOfRecord3499() {
		assertEquals("Schwent", customers.get(3498).getLastName());
	}

	@Test
	@DisplayName("Record 3499: Company is Corrozi Homes Inc")
	void CompanyOfRecord3499() {
		assertEquals("Corrozi Homes Inc", customers.get(3498).getCompany());
	}

	@Test
	@DisplayName("Record 3499: Address is 209 S Main St")
	void AddressOfRecord3499() {
		assertEquals("209 S Main St", customers.get(3498).getAddress());
	}

	@Test
	@DisplayName("Record 3499: City is Abbeville")
	void CityOfRecord3499() {
		assertEquals("Abbeville", customers.get(3498).getCity());
	}

	@Test
	@DisplayName("Record 3499: County is Abbeville")
	void CountyOfRecord3499() {
		assertEquals("Abbeville", customers.get(3498).getCounty());
	}

	@Test
	@DisplayName("Record 3499: State is SC")
	void StateOfRecord3499() {
		assertEquals("SC", customers.get(3498).getState());
	}

	@Test
	@DisplayName("Record 3499: ZIP is 29620")
	void ZIPOfRecord3499() {
		assertEquals("29620", customers.get(3498).getZIP());
	}

	@Test
	@DisplayName("Record 3499: Phone is 864-459-7233")
	void PhoneOfRecord3499() {
		assertEquals("864-459-7233", customers.get(3498).getPhone());
	}

	@Test
	@DisplayName("Record 3499: Fax is 864-459-5584")
	void FaxOfRecord3499() {
		assertEquals("864-459-5584", customers.get(3498).getFax());
	}

	@Test
	@DisplayName("Record 3499: Email is valeria@schwent.com")
	void EmailOfRecord3499() {
		assertEquals("valeria@schwent.com", customers.get(3498).getEmail());
	}

	@Test
	@DisplayName("Record 3499: Web is http://www.valeriaschwent.com")
	void WebOfRecord3499() {
		assertEquals("http://www.valeriaschwent.com", customers.get(3498).getWeb());
	}
}
