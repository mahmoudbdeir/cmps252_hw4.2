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

@Tag("37")
class Record_3351 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3351: FirstName is Arthur")
	void FirstNameOfRecord3351() {
		assertEquals("Arthur", customers.get(3350).getFirstName());
	}

	@Test
	@DisplayName("Record 3351: LastName is Pondexter")
	void LastNameOfRecord3351() {
		assertEquals("Pondexter", customers.get(3350).getLastName());
	}

	@Test
	@DisplayName("Record 3351: Company is Water Department")
	void CompanyOfRecord3351() {
		assertEquals("Water Department", customers.get(3350).getCompany());
	}

	@Test
	@DisplayName("Record 3351: Address is 908 Memorial Pky Nw")
	void AddressOfRecord3351() {
		assertEquals("908 Memorial Pky Nw", customers.get(3350).getAddress());
	}

	@Test
	@DisplayName("Record 3351: City is Huntsville")
	void CityOfRecord3351() {
		assertEquals("Huntsville", customers.get(3350).getCity());
	}

	@Test
	@DisplayName("Record 3351: County is Madison")
	void CountyOfRecord3351() {
		assertEquals("Madison", customers.get(3350).getCounty());
	}

	@Test
	@DisplayName("Record 3351: State is AL")
	void StateOfRecord3351() {
		assertEquals("AL", customers.get(3350).getState());
	}

	@Test
	@DisplayName("Record 3351: ZIP is 35801")
	void ZIPOfRecord3351() {
		assertEquals("35801", customers.get(3350).getZIP());
	}

	@Test
	@DisplayName("Record 3351: Phone is 256-533-8989")
	void PhoneOfRecord3351() {
		assertEquals("256-533-8989", customers.get(3350).getPhone());
	}

	@Test
	@DisplayName("Record 3351: Fax is 256-533-8598")
	void FaxOfRecord3351() {
		assertEquals("256-533-8598", customers.get(3350).getFax());
	}

	@Test
	@DisplayName("Record 3351: Email is arthur@pondexter.com")
	void EmailOfRecord3351() {
		assertEquals("arthur@pondexter.com", customers.get(3350).getEmail());
	}

	@Test
	@DisplayName("Record 3351: Web is http://www.arthurpondexter.com")
	void WebOfRecord3351() {
		assertEquals("http://www.arthurpondexter.com", customers.get(3350).getWeb());
	}
}
