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
class Record_3208 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3208: FirstName is Denise")
	void FirstNameOfRecord3208() {
		assertEquals("Denise", customers.get(3207).getFirstName());
	}

	@Test
	@DisplayName("Record 3208: LastName is Middleton")
	void LastNameOfRecord3208() {
		assertEquals("Middleton", customers.get(3207).getLastName());
	}

	@Test
	@DisplayName("Record 3208: Company is Land Title Ins Co St Louis")
	void CompanyOfRecord3208() {
		assertEquals("Land Title Ins Co St Louis", customers.get(3207).getCompany());
	}

	@Test
	@DisplayName("Record 3208: Address is 8514 Eager Rd")
	void AddressOfRecord3208() {
		assertEquals("8514 Eager Rd", customers.get(3207).getAddress());
	}

	@Test
	@DisplayName("Record 3208: City is Saint Louis")
	void CityOfRecord3208() {
		assertEquals("Saint Louis", customers.get(3207).getCity());
	}

	@Test
	@DisplayName("Record 3208: County is Saint Louis")
	void CountyOfRecord3208() {
		assertEquals("Saint Louis", customers.get(3207).getCounty());
	}

	@Test
	@DisplayName("Record 3208: State is MO")
	void StateOfRecord3208() {
		assertEquals("MO", customers.get(3207).getState());
	}

	@Test
	@DisplayName("Record 3208: ZIP is 63144")
	void ZIPOfRecord3208() {
		assertEquals("63144", customers.get(3207).getZIP());
	}

	@Test
	@DisplayName("Record 3208: Phone is 314-968-8973")
	void PhoneOfRecord3208() {
		assertEquals("314-968-8973", customers.get(3207).getPhone());
	}

	@Test
	@DisplayName("Record 3208: Fax is 314-968-4804")
	void FaxOfRecord3208() {
		assertEquals("314-968-4804", customers.get(3207).getFax());
	}

	@Test
	@DisplayName("Record 3208: Email is denise@middleton.com")
	void EmailOfRecord3208() {
		assertEquals("denise@middleton.com", customers.get(3207).getEmail());
	}

	@Test
	@DisplayName("Record 3208: Web is http://www.denisemiddleton.com")
	void WebOfRecord3208() {
		assertEquals("http://www.denisemiddleton.com", customers.get(3207).getWeb());
	}
}
