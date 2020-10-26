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

@Tag("11")
class Record_4781 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4781: FirstName is Fausto")
	void FirstNameOfRecord4781() {
		assertEquals("Fausto", customers.get(4780).getFirstName());
	}

	@Test
	@DisplayName("Record 4781: LastName is Minissale")
	void LastNameOfRecord4781() {
		assertEquals("Minissale", customers.get(4780).getLastName());
	}

	@Test
	@DisplayName("Record 4781: Company is A Dombrowsky & Sons")
	void CompanyOfRecord4781() {
		assertEquals("A Dombrowsky & Sons", customers.get(4780).getCompany());
	}

	@Test
	@DisplayName("Record 4781: Address is 2215 Boul")
	void AddressOfRecord4781() {
		assertEquals("2215 Boul", customers.get(4780).getAddress());
	}

	@Test
	@DisplayName("Record 4781: City is Colonial Hyghts")
	void CityOfRecord4781() {
		assertEquals("Colonial Hyghts", customers.get(4780).getCity());
	}

	@Test
	@DisplayName("Record 4781: County is Colonial Hyghts City")
	void CountyOfRecord4781() {
		assertEquals("Colonial Hyghts City", customers.get(4780).getCounty());
	}

	@Test
	@DisplayName("Record 4781: State is VA")
	void StateOfRecord4781() {
		assertEquals("VA", customers.get(4780).getState());
	}

	@Test
	@DisplayName("Record 4781: ZIP is 23834")
	void ZIPOfRecord4781() {
		assertEquals("23834", customers.get(4780).getZIP());
	}

	@Test
	@DisplayName("Record 4781: Phone is 804-520-4627")
	void PhoneOfRecord4781() {
		assertEquals("804-520-4627", customers.get(4780).getPhone());
	}

	@Test
	@DisplayName("Record 4781: Fax is 804-520-6916")
	void FaxOfRecord4781() {
		assertEquals("804-520-6916", customers.get(4780).getFax());
	}

	@Test
	@DisplayName("Record 4781: Email is fausto@minissale.com")
	void EmailOfRecord4781() {
		assertEquals("fausto@minissale.com", customers.get(4780).getEmail());
	}

	@Test
	@DisplayName("Record 4781: Web is http://www.faustominissale.com")
	void WebOfRecord4781() {
		assertEquals("http://www.faustominissale.com", customers.get(4780).getWeb());
	}
}
