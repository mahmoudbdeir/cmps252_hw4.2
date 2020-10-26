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

@Tag("5")
class Record_1747 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1747: FirstName is Johnathan")
	void FirstNameOfRecord1747() {
		assertEquals("Johnathan", customers.get(1746).getFirstName());
	}

	@Test
	@DisplayName("Record 1747: LastName is Lizama")
	void LastNameOfRecord1747() {
		assertEquals("Lizama", customers.get(1746).getLastName());
	}

	@Test
	@DisplayName("Record 1747: Company is J B Catering")
	void CompanyOfRecord1747() {
		assertEquals("J B Catering", customers.get(1746).getCompany());
	}

	@Test
	@DisplayName("Record 1747: Address is 55 W Monroe St  #-990")
	void AddressOfRecord1747() {
		assertEquals("55 W Monroe St  #-990", customers.get(1746).getAddress());
	}

	@Test
	@DisplayName("Record 1747: City is Chicago")
	void CityOfRecord1747() {
		assertEquals("Chicago", customers.get(1746).getCity());
	}

	@Test
	@DisplayName("Record 1747: County is Cook")
	void CountyOfRecord1747() {
		assertEquals("Cook", customers.get(1746).getCounty());
	}

	@Test
	@DisplayName("Record 1747: State is IL")
	void StateOfRecord1747() {
		assertEquals("IL", customers.get(1746).getState());
	}

	@Test
	@DisplayName("Record 1747: ZIP is 60603")
	void ZIPOfRecord1747() {
		assertEquals("60603", customers.get(1746).getZIP());
	}

	@Test
	@DisplayName("Record 1747: Phone is 312-346-5051")
	void PhoneOfRecord1747() {
		assertEquals("312-346-5051", customers.get(1746).getPhone());
	}

	@Test
	@DisplayName("Record 1747: Fax is 312-346-8939")
	void FaxOfRecord1747() {
		assertEquals("312-346-8939", customers.get(1746).getFax());
	}

	@Test
	@DisplayName("Record 1747: Email is johnathan@lizama.com")
	void EmailOfRecord1747() {
		assertEquals("johnathan@lizama.com", customers.get(1746).getEmail());
	}

	@Test
	@DisplayName("Record 1747: Web is http://www.johnathanlizama.com")
	void WebOfRecord1747() {
		assertEquals("http://www.johnathanlizama.com", customers.get(1746).getWeb());
	}
}
