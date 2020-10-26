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

@Tag("21")
class Record_4402 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4402: FirstName is Derrick")
	void FirstNameOfRecord4402() {
		assertEquals("Derrick", customers.get(4401).getFirstName());
	}

	@Test
	@DisplayName("Record 4402: LastName is Benny")
	void LastNameOfRecord4402() {
		assertEquals("Benny", customers.get(4401).getLastName());
	}

	@Test
	@DisplayName("Record 4402: Company is King Ins Agcy")
	void CompanyOfRecord4402() {
		assertEquals("King Ins Agcy", customers.get(4401).getCompany());
	}

	@Test
	@DisplayName("Record 4402: Address is 1941 West Aven  #-140")
	void AddressOfRecord4402() {
		assertEquals("1941 West Aven  #-140", customers.get(4401).getAddress());
	}

	@Test
	@DisplayName("Record 4402: City is San Leandro")
	void CityOfRecord4402() {
		assertEquals("San Leandro", customers.get(4401).getCity());
	}

	@Test
	@DisplayName("Record 4402: County is Alameda")
	void CountyOfRecord4402() {
		assertEquals("Alameda", customers.get(4401).getCounty());
	}

	@Test
	@DisplayName("Record 4402: State is CA")
	void StateOfRecord4402() {
		assertEquals("CA", customers.get(4401).getState());
	}

	@Test
	@DisplayName("Record 4402: ZIP is 94577")
	void ZIPOfRecord4402() {
		assertEquals("94577", customers.get(4401).getZIP());
	}

	@Test
	@DisplayName("Record 4402: Phone is 510-483-9016")
	void PhoneOfRecord4402() {
		assertEquals("510-483-9016", customers.get(4401).getPhone());
	}

	@Test
	@DisplayName("Record 4402: Fax is 510-483-8088")
	void FaxOfRecord4402() {
		assertEquals("510-483-8088", customers.get(4401).getFax());
	}

	@Test
	@DisplayName("Record 4402: Email is derrick@benny.com")
	void EmailOfRecord4402() {
		assertEquals("derrick@benny.com", customers.get(4401).getEmail());
	}

	@Test
	@DisplayName("Record 4402: Web is http://www.derrickbenny.com")
	void WebOfRecord4402() {
		assertEquals("http://www.derrickbenny.com", customers.get(4401).getWeb());
	}
}
