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

@Tag("2")
class Record_4727 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4727: FirstName is Franklyn")
	void FirstNameOfRecord4727() {
		assertEquals("Franklyn", customers.get(4726).getFirstName());
	}

	@Test
	@DisplayName("Record 4727: LastName is Galaviz")
	void LastNameOfRecord4727() {
		assertEquals("Galaviz", customers.get(4726).getLastName());
	}

	@Test
	@DisplayName("Record 4727: Company is Pinkerton & Friedman")
	void CompanyOfRecord4727() {
		assertEquals("Pinkerton & Friedman", customers.get(4726).getCompany());
	}

	@Test
	@DisplayName("Record 4727: Address is 444 E College Ave  #-250")
	void AddressOfRecord4727() {
		assertEquals("444 E College Ave  #-250", customers.get(4726).getAddress());
	}

	@Test
	@DisplayName("Record 4727: City is State College")
	void CityOfRecord4727() {
		assertEquals("State College", customers.get(4726).getCity());
	}

	@Test
	@DisplayName("Record 4727: County is Centre")
	void CountyOfRecord4727() {
		assertEquals("Centre", customers.get(4726).getCounty());
	}

	@Test
	@DisplayName("Record 4727: State is PA")
	void StateOfRecord4727() {
		assertEquals("PA", customers.get(4726).getState());
	}

	@Test
	@DisplayName("Record 4727: ZIP is 16801")
	void ZIPOfRecord4727() {
		assertEquals("16801", customers.get(4726).getZIP());
	}

	@Test
	@DisplayName("Record 4727: Phone is 814-238-3314")
	void PhoneOfRecord4727() {
		assertEquals("814-238-3314", customers.get(4726).getPhone());
	}

	@Test
	@DisplayName("Record 4727: Fax is 814-238-6199")
	void FaxOfRecord4727() {
		assertEquals("814-238-6199", customers.get(4726).getFax());
	}

	@Test
	@DisplayName("Record 4727: Email is franklyn@galaviz.com")
	void EmailOfRecord4727() {
		assertEquals("franklyn@galaviz.com", customers.get(4726).getEmail());
	}

	@Test
	@DisplayName("Record 4727: Web is http://www.franklyngalaviz.com")
	void WebOfRecord4727() {
		assertEquals("http://www.franklyngalaviz.com", customers.get(4726).getWeb());
	}
}
