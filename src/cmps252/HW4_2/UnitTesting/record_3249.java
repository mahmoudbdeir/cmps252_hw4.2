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

@Tag("47")
class Record_3249 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3249: FirstName is Eugenio")
	void FirstNameOfRecord3249() {
		assertEquals("Eugenio", customers.get(3248).getFirstName());
	}

	@Test
	@DisplayName("Record 3249: LastName is Casgrove")
	void LastNameOfRecord3249() {
		assertEquals("Casgrove", customers.get(3248).getLastName());
	}

	@Test
	@DisplayName("Record 3249: Company is Marble Works Inc")
	void CompanyOfRecord3249() {
		assertEquals("Marble Works Inc", customers.get(3248).getCompany());
	}

	@Test
	@DisplayName("Record 3249: Address is 2556 Clearview Ave Nw")
	void AddressOfRecord3249() {
		assertEquals("2556 Clearview Ave Nw", customers.get(3248).getAddress());
	}

	@Test
	@DisplayName("Record 3249: City is Canton")
	void CityOfRecord3249() {
		assertEquals("Canton", customers.get(3248).getCity());
	}

	@Test
	@DisplayName("Record 3249: County is Stark")
	void CountyOfRecord3249() {
		assertEquals("Stark", customers.get(3248).getCounty());
	}

	@Test
	@DisplayName("Record 3249: State is OH")
	void StateOfRecord3249() {
		assertEquals("OH", customers.get(3248).getState());
	}

	@Test
	@DisplayName("Record 3249: ZIP is 44718")
	void ZIPOfRecord3249() {
		assertEquals("44718", customers.get(3248).getZIP());
	}

	@Test
	@DisplayName("Record 3249: Phone is 330-456-1769")
	void PhoneOfRecord3249() {
		assertEquals("330-456-1769", customers.get(3248).getPhone());
	}

	@Test
	@DisplayName("Record 3249: Fax is 330-456-9264")
	void FaxOfRecord3249() {
		assertEquals("330-456-9264", customers.get(3248).getFax());
	}

	@Test
	@DisplayName("Record 3249: Email is eugenio@casgrove.com")
	void EmailOfRecord3249() {
		assertEquals("eugenio@casgrove.com", customers.get(3248).getEmail());
	}

	@Test
	@DisplayName("Record 3249: Web is http://www.eugeniocasgrove.com")
	void WebOfRecord3249() {
		assertEquals("http://www.eugeniocasgrove.com", customers.get(3248).getWeb());
	}
}
