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

@Tag("5")
class Record_3829 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3829: FirstName is Gayle")
	void FirstNameOfRecord3829() {
		assertEquals("Gayle", customers.get(3828).getFirstName());
	}

	@Test
	@DisplayName("Record 3829: LastName is Grosskreuts")
	void LastNameOfRecord3829() {
		assertEquals("Grosskreuts", customers.get(3828).getLastName());
	}

	@Test
	@DisplayName("Record 3829: Company is Covington Detroit Diesel")
	void CompanyOfRecord3829() {
		assertEquals("Covington Detroit Diesel", customers.get(3828).getCompany());
	}

	@Test
	@DisplayName("Record 3829: Address is 27403 Industrial Blvd")
	void AddressOfRecord3829() {
		assertEquals("27403 Industrial Blvd", customers.get(3828).getAddress());
	}

	@Test
	@DisplayName("Record 3829: City is Hayward")
	void CityOfRecord3829() {
		assertEquals("Hayward", customers.get(3828).getCity());
	}

	@Test
	@DisplayName("Record 3829: County is Alameda")
	void CountyOfRecord3829() {
		assertEquals("Alameda", customers.get(3828).getCounty());
	}

	@Test
	@DisplayName("Record 3829: State is CA")
	void StateOfRecord3829() {
		assertEquals("CA", customers.get(3828).getState());
	}

	@Test
	@DisplayName("Record 3829: ZIP is 94545")
	void ZIPOfRecord3829() {
		assertEquals("94545", customers.get(3828).getZIP());
	}

	@Test
	@DisplayName("Record 3829: Phone is 510-782-7735")
	void PhoneOfRecord3829() {
		assertEquals("510-782-7735", customers.get(3828).getPhone());
	}

	@Test
	@DisplayName("Record 3829: Fax is 510-782-0557")
	void FaxOfRecord3829() {
		assertEquals("510-782-0557", customers.get(3828).getFax());
	}

	@Test
	@DisplayName("Record 3829: Email is gayle@grosskreuts.com")
	void EmailOfRecord3829() {
		assertEquals("gayle@grosskreuts.com", customers.get(3828).getEmail());
	}

	@Test
	@DisplayName("Record 3829: Web is http://www.gaylegrosskreuts.com")
	void WebOfRecord3829() {
		assertEquals("http://www.gaylegrosskreuts.com", customers.get(3828).getWeb());
	}
}
