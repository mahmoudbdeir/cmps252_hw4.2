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
class Record_3266 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3266: FirstName is Jack")
	void FirstNameOfRecord3266() {
		assertEquals("Jack", customers.get(3265).getFirstName());
	}

	@Test
	@DisplayName("Record 3266: LastName is Karstensen")
	void LastNameOfRecord3266() {
		assertEquals("Karstensen", customers.get(3265).getLastName());
	}

	@Test
	@DisplayName("Record 3266: Company is Alfred Sanzari Enterprises")
	void CompanyOfRecord3266() {
		assertEquals("Alfred Sanzari Enterprises", customers.get(3265).getCompany());
	}

	@Test
	@DisplayName("Record 3266: Address is 4605 N Woodward Ave")
	void AddressOfRecord3266() {
		assertEquals("4605 N Woodward Ave", customers.get(3265).getAddress());
	}

	@Test
	@DisplayName("Record 3266: City is Royal Oak")
	void CityOfRecord3266() {
		assertEquals("Royal Oak", customers.get(3265).getCity());
	}

	@Test
	@DisplayName("Record 3266: County is Oakland")
	void CountyOfRecord3266() {
		assertEquals("Oakland", customers.get(3265).getCounty());
	}

	@Test
	@DisplayName("Record 3266: State is MI")
	void StateOfRecord3266() {
		assertEquals("MI", customers.get(3265).getState());
	}

	@Test
	@DisplayName("Record 3266: ZIP is 48073")
	void ZIPOfRecord3266() {
		assertEquals("48073", customers.get(3265).getZIP());
	}

	@Test
	@DisplayName("Record 3266: Phone is 248-549-5436")
	void PhoneOfRecord3266() {
		assertEquals("248-549-5436", customers.get(3265).getPhone());
	}

	@Test
	@DisplayName("Record 3266: Fax is 248-549-5128")
	void FaxOfRecord3266() {
		assertEquals("248-549-5128", customers.get(3265).getFax());
	}

	@Test
	@DisplayName("Record 3266: Email is jack@karstensen.com")
	void EmailOfRecord3266() {
		assertEquals("jack@karstensen.com", customers.get(3265).getEmail());
	}

	@Test
	@DisplayName("Record 3266: Web is http://www.jackkarstensen.com")
	void WebOfRecord3266() {
		assertEquals("http://www.jackkarstensen.com", customers.get(3265).getWeb());
	}
}
