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

@Tag("49")
class Record_811 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 811: FirstName is Dewey")
	void FirstNameOfRecord811() {
		assertEquals("Dewey", customers.get(810).getFirstName());
	}

	@Test
	@DisplayName("Record 811: LastName is Beser")
	void LastNameOfRecord811() {
		assertEquals("Beser", customers.get(810).getLastName());
	}

	@Test
	@DisplayName("Record 811: Company is Miami Systems Datafold Forms")
	void CompanyOfRecord811() {
		assertEquals("Miami Systems Datafold Forms", customers.get(810).getCompany());
	}

	@Test
	@DisplayName("Record 811: Address is 402 S Stephenson Hwy")
	void AddressOfRecord811() {
		assertEquals("402 S Stephenson Hwy", customers.get(810).getAddress());
	}

	@Test
	@DisplayName("Record 811: City is Royal Oak")
	void CityOfRecord811() {
		assertEquals("Royal Oak", customers.get(810).getCity());
	}

	@Test
	@DisplayName("Record 811: County is Oakland")
	void CountyOfRecord811() {
		assertEquals("Oakland", customers.get(810).getCounty());
	}

	@Test
	@DisplayName("Record 811: State is MI")
	void StateOfRecord811() {
		assertEquals("MI", customers.get(810).getState());
	}

	@Test
	@DisplayName("Record 811: ZIP is 48067")
	void ZIPOfRecord811() {
		assertEquals("48067", customers.get(810).getZIP());
	}

	@Test
	@DisplayName("Record 811: Phone is 248-546-7426")
	void PhoneOfRecord811() {
		assertEquals("248-546-7426", customers.get(810).getPhone());
	}

	@Test
	@DisplayName("Record 811: Fax is 248-546-1424")
	void FaxOfRecord811() {
		assertEquals("248-546-1424", customers.get(810).getFax());
	}

	@Test
	@DisplayName("Record 811: Email is dewey@beser.com")
	void EmailOfRecord811() {
		assertEquals("dewey@beser.com", customers.get(810).getEmail());
	}

	@Test
	@DisplayName("Record 811: Web is http://www.deweybeser.com")
	void WebOfRecord811() {
		assertEquals("http://www.deweybeser.com", customers.get(810).getWeb());
	}
}
