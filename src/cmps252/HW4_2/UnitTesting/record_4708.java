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

@Tag("33")
class Record_4708 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4708: FirstName is Mary")
	void FirstNameOfRecord4708() {
		assertEquals("Mary", customers.get(4707).getFirstName());
	}

	@Test
	@DisplayName("Record 4708: LastName is Cantos")
	void LastNameOfRecord4708() {
		assertEquals("Cantos", customers.get(4707).getLastName());
	}

	@Test
	@DisplayName("Record 4708: Company is Cash Jones & Springhetti")
	void CompanyOfRecord4708() {
		assertEquals("Cash Jones & Springhetti", customers.get(4707).getCompany());
	}

	@Test
	@DisplayName("Record 4708: Address is 1824 Whipple Ave Nw")
	void AddressOfRecord4708() {
		assertEquals("1824 Whipple Ave Nw", customers.get(4707).getAddress());
	}

	@Test
	@DisplayName("Record 4708: City is Canton")
	void CityOfRecord4708() {
		assertEquals("Canton", customers.get(4707).getCity());
	}

	@Test
	@DisplayName("Record 4708: County is Stark")
	void CountyOfRecord4708() {
		assertEquals("Stark", customers.get(4707).getCounty());
	}

	@Test
	@DisplayName("Record 4708: State is OH")
	void StateOfRecord4708() {
		assertEquals("OH", customers.get(4707).getState());
	}

	@Test
	@DisplayName("Record 4708: ZIP is 44708")
	void ZIPOfRecord4708() {
		assertEquals("44708", customers.get(4707).getZIP());
	}

	@Test
	@DisplayName("Record 4708: Phone is 330-478-5009")
	void PhoneOfRecord4708() {
		assertEquals("330-478-5009", customers.get(4707).getPhone());
	}

	@Test
	@DisplayName("Record 4708: Fax is 330-478-0591")
	void FaxOfRecord4708() {
		assertEquals("330-478-0591", customers.get(4707).getFax());
	}

	@Test
	@DisplayName("Record 4708: Email is mary@cantos.com")
	void EmailOfRecord4708() {
		assertEquals("mary@cantos.com", customers.get(4707).getEmail());
	}

	@Test
	@DisplayName("Record 4708: Web is http://www.marycantos.com")
	void WebOfRecord4708() {
		assertEquals("http://www.marycantos.com", customers.get(4707).getWeb());
	}
}
