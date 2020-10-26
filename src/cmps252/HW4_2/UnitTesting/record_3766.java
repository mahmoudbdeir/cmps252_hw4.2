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

@Tag("20")
class Record_3766 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3766: FirstName is Wesley")
	void FirstNameOfRecord3766() {
		assertEquals("Wesley", customers.get(3765).getFirstName());
	}

	@Test
	@DisplayName("Record 3766: LastName is Platenburg")
	void LastNameOfRecord3766() {
		assertEquals("Platenburg", customers.get(3765).getLastName());
	}

	@Test
	@DisplayName("Record 3766: Company is E & G Classics Inc")
	void CompanyOfRecord3766() {
		assertEquals("E & G Classics Inc", customers.get(3765).getCompany());
	}

	@Test
	@DisplayName("Record 3766: Address is 3030 S Mullen St")
	void AddressOfRecord3766() {
		assertEquals("3030 S Mullen St", customers.get(3765).getAddress());
	}

	@Test
	@DisplayName("Record 3766: City is Tacoma")
	void CityOfRecord3766() {
		assertEquals("Tacoma", customers.get(3765).getCity());
	}

	@Test
	@DisplayName("Record 3766: County is Pierce")
	void CountyOfRecord3766() {
		assertEquals("Pierce", customers.get(3765).getCounty());
	}

	@Test
	@DisplayName("Record 3766: State is WA")
	void StateOfRecord3766() {
		assertEquals("WA", customers.get(3765).getState());
	}

	@Test
	@DisplayName("Record 3766: ZIP is 98409")
	void ZIPOfRecord3766() {
		assertEquals("98409", customers.get(3765).getZIP());
	}

	@Test
	@DisplayName("Record 3766: Phone is 253-564-1578")
	void PhoneOfRecord3766() {
		assertEquals("253-564-1578", customers.get(3765).getPhone());
	}

	@Test
	@DisplayName("Record 3766: Fax is 253-564-9006")
	void FaxOfRecord3766() {
		assertEquals("253-564-9006", customers.get(3765).getFax());
	}

	@Test
	@DisplayName("Record 3766: Email is wesley@platenburg.com")
	void EmailOfRecord3766() {
		assertEquals("wesley@platenburg.com", customers.get(3765).getEmail());
	}

	@Test
	@DisplayName("Record 3766: Web is http://www.wesleyplatenburg.com")
	void WebOfRecord3766() {
		assertEquals("http://www.wesleyplatenburg.com", customers.get(3765).getWeb());
	}
}
