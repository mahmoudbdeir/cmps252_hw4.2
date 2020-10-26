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

@Tag("23")
class Record_711 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 711: FirstName is Antoinette")
	void FirstNameOfRecord711() {
		assertEquals("Antoinette", customers.get(710).getFirstName());
	}

	@Test
	@DisplayName("Record 711: LastName is Applen")
	void LastNameOfRecord711() {
		assertEquals("Applen", customers.get(710).getLastName());
	}

	@Test
	@DisplayName("Record 711: Company is A & D Oilfield Dozers Inc")
	void CompanyOfRecord711() {
		assertEquals("A & D Oilfield Dozers Inc", customers.get(710).getCompany());
	}

	@Test
	@DisplayName("Record 711: Address is 16 S Church St")
	void AddressOfRecord711() {
		assertEquals("16 S Church St", customers.get(710).getAddress());
	}

	@Test
	@DisplayName("Record 711: City is West Chester")
	void CityOfRecord711() {
		assertEquals("West Chester", customers.get(710).getCity());
	}

	@Test
	@DisplayName("Record 711: County is Chester")
	void CountyOfRecord711() {
		assertEquals("Chester", customers.get(710).getCounty());
	}

	@Test
	@DisplayName("Record 711: State is PA")
	void StateOfRecord711() {
		assertEquals("PA", customers.get(710).getState());
	}

	@Test
	@DisplayName("Record 711: ZIP is 19382")
	void ZIPOfRecord711() {
		assertEquals("19382", customers.get(710).getZIP());
	}

	@Test
	@DisplayName("Record 711: Phone is 610-692-2043")
	void PhoneOfRecord711() {
		assertEquals("610-692-2043", customers.get(710).getPhone());
	}

	@Test
	@DisplayName("Record 711: Fax is 610-692-2825")
	void FaxOfRecord711() {
		assertEquals("610-692-2825", customers.get(710).getFax());
	}

	@Test
	@DisplayName("Record 711: Email is antoinette@applen.com")
	void EmailOfRecord711() {
		assertEquals("antoinette@applen.com", customers.get(710).getEmail());
	}

	@Test
	@DisplayName("Record 711: Web is http://www.antoinetteapplen.com")
	void WebOfRecord711() {
		assertEquals("http://www.antoinetteapplen.com", customers.get(710).getWeb());
	}
}
