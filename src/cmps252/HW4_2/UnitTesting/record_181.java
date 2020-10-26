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

@Tag("46")
class Record_181 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 181: FirstName is Pamala")
	void FirstNameOfRecord181() {
		assertEquals("Pamala", customers.get(180).getFirstName());
	}

	@Test
	@DisplayName("Record 181: LastName is Bedson")
	void LastNameOfRecord181() {
		assertEquals("Bedson", customers.get(180).getLastName());
	}

	@Test
	@DisplayName("Record 181: Company is Daily Democrat")
	void CompanyOfRecord181() {
		assertEquals("Daily Democrat", customers.get(180).getCompany());
	}

	@Test
	@DisplayName("Record 181: Address is 55 S 7th St")
	void AddressOfRecord181() {
		assertEquals("55 S 7th St", customers.get(180).getAddress());
	}

	@Test
	@DisplayName("Record 181: City is Emmaus")
	void CityOfRecord181() {
		assertEquals("Emmaus", customers.get(180).getCity());
	}

	@Test
	@DisplayName("Record 181: County is Lehigh")
	void CountyOfRecord181() {
		assertEquals("Lehigh", customers.get(180).getCounty());
	}

	@Test
	@DisplayName("Record 181: State is PA")
	void StateOfRecord181() {
		assertEquals("PA", customers.get(180).getState());
	}

	@Test
	@DisplayName("Record 181: ZIP is 18049")
	void ZIPOfRecord181() {
		assertEquals("18049", customers.get(180).getZIP());
	}

	@Test
	@DisplayName("Record 181: Phone is 610-967-6838")
	void PhoneOfRecord181() {
		assertEquals("610-967-6838", customers.get(180).getPhone());
	}

	@Test
	@DisplayName("Record 181: Fax is 610-967-7858")
	void FaxOfRecord181() {
		assertEquals("610-967-7858", customers.get(180).getFax());
	}

	@Test
	@DisplayName("Record 181: Email is pamala@bedson.com")
	void EmailOfRecord181() {
		assertEquals("pamala@bedson.com", customers.get(180).getEmail());
	}

	@Test
	@DisplayName("Record 181: Web is http://www.pamalabedson.com")
	void WebOfRecord181() {
		assertEquals("http://www.pamalabedson.com", customers.get(180).getWeb());
	}
}
