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

@Tag("32")
class Record_3145 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3145: FirstName is June")
	void FirstNameOfRecord3145() {
		assertEquals("June", customers.get(3144).getFirstName());
	}

	@Test
	@DisplayName("Record 3145: LastName is Prchlik")
	void LastNameOfRecord3145() {
		assertEquals("Prchlik", customers.get(3144).getLastName());
	}

	@Test
	@DisplayName("Record 3145: Company is Woo, Craig C Esq")
	void CompanyOfRecord3145() {
		assertEquals("Woo, Craig C Esq", customers.get(3144).getCompany());
	}

	@Test
	@DisplayName("Record 3145: Address is 494 S Ripley Blvd")
	void AddressOfRecord3145() {
		assertEquals("494 S Ripley Blvd", customers.get(3144).getAddress());
	}

	@Test
	@DisplayName("Record 3145: City is Alpena")
	void CityOfRecord3145() {
		assertEquals("Alpena", customers.get(3144).getCity());
	}

	@Test
	@DisplayName("Record 3145: County is Alpena")
	void CountyOfRecord3145() {
		assertEquals("Alpena", customers.get(3144).getCounty());
	}

	@Test
	@DisplayName("Record 3145: State is MI")
	void StateOfRecord3145() {
		assertEquals("MI", customers.get(3144).getState());
	}

	@Test
	@DisplayName("Record 3145: ZIP is 49707")
	void ZIPOfRecord3145() {
		assertEquals("49707", customers.get(3144).getZIP());
	}

	@Test
	@DisplayName("Record 3145: Phone is 989-354-5707")
	void PhoneOfRecord3145() {
		assertEquals("989-354-5707", customers.get(3144).getPhone());
	}

	@Test
	@DisplayName("Record 3145: Fax is 989-354-8406")
	void FaxOfRecord3145() {
		assertEquals("989-354-8406", customers.get(3144).getFax());
	}

	@Test
	@DisplayName("Record 3145: Email is june@prchlik.com")
	void EmailOfRecord3145() {
		assertEquals("june@prchlik.com", customers.get(3144).getEmail());
	}

	@Test
	@DisplayName("Record 3145: Web is http://www.juneprchlik.com")
	void WebOfRecord3145() {
		assertEquals("http://www.juneprchlik.com", customers.get(3144).getWeb());
	}
}
