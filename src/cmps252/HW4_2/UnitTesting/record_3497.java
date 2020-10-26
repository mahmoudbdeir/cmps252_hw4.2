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

@Tag("49")
class Record_3497 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3497: FirstName is Andy")
	void FirstNameOfRecord3497() {
		assertEquals("Andy", customers.get(3496).getFirstName());
	}

	@Test
	@DisplayName("Record 3497: LastName is Mcglohon")
	void LastNameOfRecord3497() {
		assertEquals("Mcglohon", customers.get(3496).getLastName());
	}

	@Test
	@DisplayName("Record 3497: Company is Grtr Palatine C Of C & Indust")
	void CompanyOfRecord3497() {
		assertEquals("Grtr Palatine C Of C & Indust", customers.get(3496).getCompany());
	}

	@Test
	@DisplayName("Record 3497: Address is 1212 Charity St")
	void AddressOfRecord3497() {
		assertEquals("1212 Charity St", customers.get(3496).getAddress());
	}

	@Test
	@DisplayName("Record 3497: City is Abbeville")
	void CityOfRecord3497() {
		assertEquals("Abbeville", customers.get(3496).getCity());
	}

	@Test
	@DisplayName("Record 3497: County is Vermilion")
	void CountyOfRecord3497() {
		assertEquals("Vermilion", customers.get(3496).getCounty());
	}

	@Test
	@DisplayName("Record 3497: State is LA")
	void StateOfRecord3497() {
		assertEquals("LA", customers.get(3496).getState());
	}

	@Test
	@DisplayName("Record 3497: ZIP is 70510")
	void ZIPOfRecord3497() {
		assertEquals("70510", customers.get(3496).getZIP());
	}

	@Test
	@DisplayName("Record 3497: Phone is 337-893-7666")
	void PhoneOfRecord3497() {
		assertEquals("337-893-7666", customers.get(3496).getPhone());
	}

	@Test
	@DisplayName("Record 3497: Fax is 337-893-6292")
	void FaxOfRecord3497() {
		assertEquals("337-893-6292", customers.get(3496).getFax());
	}

	@Test
	@DisplayName("Record 3497: Email is andy@mcglohon.com")
	void EmailOfRecord3497() {
		assertEquals("andy@mcglohon.com", customers.get(3496).getEmail());
	}

	@Test
	@DisplayName("Record 3497: Web is http://www.andymcglohon.com")
	void WebOfRecord3497() {
		assertEquals("http://www.andymcglohon.com", customers.get(3496).getWeb());
	}
}
