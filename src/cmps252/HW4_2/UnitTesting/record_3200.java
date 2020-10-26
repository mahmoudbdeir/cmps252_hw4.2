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

@Tag("24")
class Record_3200 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3200: FirstName is Donnell")
	void FirstNameOfRecord3200() {
		assertEquals("Donnell", customers.get(3199).getFirstName());
	}

	@Test
	@DisplayName("Record 3200: LastName is Minty")
	void LastNameOfRecord3200() {
		assertEquals("Minty", customers.get(3199).getLastName());
	}

	@Test
	@DisplayName("Record 3200: Company is All Pro Ind Finishes Inc")
	void CompanyOfRecord3200() {
		assertEquals("All Pro Ind Finishes Inc", customers.get(3199).getCompany());
	}

	@Test
	@DisplayName("Record 3200: Address is 21 E Main St")
	void AddressOfRecord3200() {
		assertEquals("21 E Main St", customers.get(3199).getAddress());
	}

	@Test
	@DisplayName("Record 3200: City is Westborough")
	void CityOfRecord3200() {
		assertEquals("Westborough", customers.get(3199).getCity());
	}

	@Test
	@DisplayName("Record 3200: County is Worcester")
	void CountyOfRecord3200() {
		assertEquals("Worcester", customers.get(3199).getCounty());
	}

	@Test
	@DisplayName("Record 3200: State is MA")
	void StateOfRecord3200() {
		assertEquals("MA", customers.get(3199).getState());
	}

	@Test
	@DisplayName("Record 3200: ZIP is 01581")
	void ZIPOfRecord3200() {
		assertEquals("01581", customers.get(3199).getZIP());
	}

	@Test
	@DisplayName("Record 3200: Phone is 508-366-1679")
	void PhoneOfRecord3200() {
		assertEquals("508-366-1679", customers.get(3199).getPhone());
	}

	@Test
	@DisplayName("Record 3200: Fax is 508-366-6795")
	void FaxOfRecord3200() {
		assertEquals("508-366-6795", customers.get(3199).getFax());
	}

	@Test
	@DisplayName("Record 3200: Email is donnell@minty.com")
	void EmailOfRecord3200() {
		assertEquals("donnell@minty.com", customers.get(3199).getEmail());
	}

	@Test
	@DisplayName("Record 3200: Web is http://www.donnellminty.com")
	void WebOfRecord3200() {
		assertEquals("http://www.donnellminty.com", customers.get(3199).getWeb());
	}
}
