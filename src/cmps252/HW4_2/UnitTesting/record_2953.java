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

@Tag("18")
class Record_2953 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2953: FirstName is Modesto")
	void FirstNameOfRecord2953() {
		assertEquals("Modesto", customers.get(2952).getFirstName());
	}

	@Test
	@DisplayName("Record 2953: LastName is Tucholski")
	void LastNameOfRecord2953() {
		assertEquals("Tucholski", customers.get(2952).getLastName());
	}

	@Test
	@DisplayName("Record 2953: Company is Ballard Office Supply")
	void CompanyOfRecord2953() {
		assertEquals("Ballard Office Supply", customers.get(2952).getCompany());
	}

	@Test
	@DisplayName("Record 2953: Address is 95 S Hanover St")
	void AddressOfRecord2953() {
		assertEquals("95 S Hanover St", customers.get(2952).getAddress());
	}

	@Test
	@DisplayName("Record 2953: City is Pottstown")
	void CityOfRecord2953() {
		assertEquals("Pottstown", customers.get(2952).getCity());
	}

	@Test
	@DisplayName("Record 2953: County is Montgomery")
	void CountyOfRecord2953() {
		assertEquals("Montgomery", customers.get(2952).getCounty());
	}

	@Test
	@DisplayName("Record 2953: State is PA")
	void StateOfRecord2953() {
		assertEquals("PA", customers.get(2952).getState());
	}

	@Test
	@DisplayName("Record 2953: ZIP is 19464")
	void ZIPOfRecord2953() {
		assertEquals("19464", customers.get(2952).getZIP());
	}

	@Test
	@DisplayName("Record 2953: Phone is 610-323-8243")
	void PhoneOfRecord2953() {
		assertEquals("610-323-8243", customers.get(2952).getPhone());
	}

	@Test
	@DisplayName("Record 2953: Fax is 610-323-7141")
	void FaxOfRecord2953() {
		assertEquals("610-323-7141", customers.get(2952).getFax());
	}

	@Test
	@DisplayName("Record 2953: Email is modesto@tucholski.com")
	void EmailOfRecord2953() {
		assertEquals("modesto@tucholski.com", customers.get(2952).getEmail());
	}

	@Test
	@DisplayName("Record 2953: Web is http://www.modestotucholski.com")
	void WebOfRecord2953() {
		assertEquals("http://www.modestotucholski.com", customers.get(2952).getWeb());
	}
}
