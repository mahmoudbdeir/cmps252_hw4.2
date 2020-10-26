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

@Tag("43")
class Record_153 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 153: FirstName is Rolando")
	void FirstNameOfRecord153() {
		assertEquals("Rolando", customers.get(152).getFirstName());
	}

	@Test
	@DisplayName("Record 153: LastName is Charisse")
	void LastNameOfRecord153() {
		assertEquals("Charisse", customers.get(152).getLastName());
	}

	@Test
	@DisplayName("Record 153: Company is Greebel, Lawrence M Esq")
	void CompanyOfRecord153() {
		assertEquals("Greebel, Lawrence M Esq", customers.get(152).getCompany());
	}

	@Test
	@DisplayName("Record 153: Address is 432 Danforth Ave")
	void AddressOfRecord153() {
		assertEquals("432 Danforth Ave", customers.get(152).getAddress());
	}

	@Test
	@DisplayName("Record 153: City is Jersey City")
	void CityOfRecord153() {
		assertEquals("Jersey City", customers.get(152).getCity());
	}

	@Test
	@DisplayName("Record 153: County is Hudson")
	void CountyOfRecord153() {
		assertEquals("Hudson", customers.get(152).getCounty());
	}

	@Test
	@DisplayName("Record 153: State is NJ")
	void StateOfRecord153() {
		assertEquals("NJ", customers.get(152).getState());
	}

	@Test
	@DisplayName("Record 153: ZIP is 7305")
	void ZIPOfRecord153() {
		assertEquals("7305", customers.get(152).getZIP());
	}

	@Test
	@DisplayName("Record 153: Phone is 201-434-7104")
	void PhoneOfRecord153() {
		assertEquals("201-434-7104", customers.get(152).getPhone());
	}

	@Test
	@DisplayName("Record 153: Fax is 201-434-9567")
	void FaxOfRecord153() {
		assertEquals("201-434-9567", customers.get(152).getFax());
	}

	@Test
	@DisplayName("Record 153: Email is rolando@charisse.com")
	void EmailOfRecord153() {
		assertEquals("rolando@charisse.com", customers.get(152).getEmail());
	}

	@Test
	@DisplayName("Record 153: Web is http://www.rolandocharisse.com")
	void WebOfRecord153() {
		assertEquals("http://www.rolandocharisse.com", customers.get(152).getWeb());
	}
}
