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
class Record_3686 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3686: FirstName is Minh")
	void FirstNameOfRecord3686() {
		assertEquals("Minh", customers.get(3685).getFirstName());
	}

	@Test
	@DisplayName("Record 3686: LastName is Kassel")
	void LastNameOfRecord3686() {
		assertEquals("Kassel", customers.get(3685).getLastName());
	}

	@Test
	@DisplayName("Record 3686: Company is Memphis Winnelson Whol Plbg")
	void CompanyOfRecord3686() {
		assertEquals("Memphis Winnelson Whol Plbg", customers.get(3685).getCompany());
	}

	@Test
	@DisplayName("Record 3686: Address is 50 S Steele St  #-805")
	void AddressOfRecord3686() {
		assertEquals("50 S Steele St  #-805", customers.get(3685).getAddress());
	}

	@Test
	@DisplayName("Record 3686: City is Denver")
	void CityOfRecord3686() {
		assertEquals("Denver", customers.get(3685).getCity());
	}

	@Test
	@DisplayName("Record 3686: County is Denver")
	void CountyOfRecord3686() {
		assertEquals("Denver", customers.get(3685).getCounty());
	}

	@Test
	@DisplayName("Record 3686: State is CO")
	void StateOfRecord3686() {
		assertEquals("CO", customers.get(3685).getState());
	}

	@Test
	@DisplayName("Record 3686: ZIP is 80209")
	void ZIPOfRecord3686() {
		assertEquals("80209", customers.get(3685).getZIP());
	}

	@Test
	@DisplayName("Record 3686: Phone is 303-333-5289")
	void PhoneOfRecord3686() {
		assertEquals("303-333-5289", customers.get(3685).getPhone());
	}

	@Test
	@DisplayName("Record 3686: Fax is 303-333-3749")
	void FaxOfRecord3686() {
		assertEquals("303-333-3749", customers.get(3685).getFax());
	}

	@Test
	@DisplayName("Record 3686: Email is minh@kassel.com")
	void EmailOfRecord3686() {
		assertEquals("minh@kassel.com", customers.get(3685).getEmail());
	}

	@Test
	@DisplayName("Record 3686: Web is http://www.minhkassel.com")
	void WebOfRecord3686() {
		assertEquals("http://www.minhkassel.com", customers.get(3685).getWeb());
	}
}
