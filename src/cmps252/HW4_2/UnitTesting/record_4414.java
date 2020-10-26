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

@Tag("14")
class Record_4414 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4414: FirstName is Gayla")
	void FirstNameOfRecord4414() {
		assertEquals("Gayla", customers.get(4413).getFirstName());
	}

	@Test
	@DisplayName("Record 4414: LastName is Mcsherry")
	void LastNameOfRecord4414() {
		assertEquals("Mcsherry", customers.get(4413).getLastName());
	}

	@Test
	@DisplayName("Record 4414: Company is Facial Plastic Surg Syracuse")
	void CompanyOfRecord4414() {
		assertEquals("Facial Plastic Surg Syracuse", customers.get(4413).getCompany());
	}

	@Test
	@DisplayName("Record 4414: Address is 600 S 42nd St")
	void AddressOfRecord4414() {
		assertEquals("600 S 42nd St", customers.get(4413).getAddress());
	}

	@Test
	@DisplayName("Record 4414: City is Omaha")
	void CityOfRecord4414() {
		assertEquals("Omaha", customers.get(4413).getCity());
	}

	@Test
	@DisplayName("Record 4414: County is Douglas")
	void CountyOfRecord4414() {
		assertEquals("Douglas", customers.get(4413).getCounty());
	}

	@Test
	@DisplayName("Record 4414: State is NE")
	void StateOfRecord4414() {
		assertEquals("NE", customers.get(4413).getState());
	}

	@Test
	@DisplayName("Record 4414: ZIP is 68105")
	void ZIPOfRecord4414() {
		assertEquals("68105", customers.get(4413).getZIP());
	}

	@Test
	@DisplayName("Record 4414: Phone is 402-559-2146")
	void PhoneOfRecord4414() {
		assertEquals("402-559-2146", customers.get(4413).getPhone());
	}

	@Test
	@DisplayName("Record 4414: Fax is 402-559-2807")
	void FaxOfRecord4414() {
		assertEquals("402-559-2807", customers.get(4413).getFax());
	}

	@Test
	@DisplayName("Record 4414: Email is gayla@mcsherry.com")
	void EmailOfRecord4414() {
		assertEquals("gayla@mcsherry.com", customers.get(4413).getEmail());
	}

	@Test
	@DisplayName("Record 4414: Web is http://www.gaylamcsherry.com")
	void WebOfRecord4414() {
		assertEquals("http://www.gaylamcsherry.com", customers.get(4413).getWeb());
	}
}
