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

@Tag("26")
class Record_2 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2: FirstName is Andrew")
	void FirstNameOfRecord2() {
		assertEquals("Andrew", customers.get(1).getFirstName());
	}

	@Test
	@DisplayName("Record 2: LastName is Fenstermacher")
	void LastNameOfRecord2() {
		assertEquals("Fenstermacher", customers.get(1).getLastName());
	}

	@Test
	@DisplayName("Record 2: Company is Shafer Commercial Seating Inc")
	void CompanyOfRecord2() {
		assertEquals("Shafer Commercial Seating Inc", customers.get(1).getCompany());
	}

	@Test
	@DisplayName("Record 2: Address is 2400 N Jefferson St")
	void AddressOfRecord2() {
		assertEquals("2400 N Jefferson St", customers.get(1).getAddress());
	}

	@Test
	@DisplayName("Record 2: City is Perry")
	void CityOfRecord2() {
		assertEquals("Perry", customers.get(1).getCity());
	}

	@Test
	@DisplayName("Record 2: County is Taylor")
	void CountyOfRecord2() {
		assertEquals("Taylor", customers.get(1).getCounty());
	}

	@Test
	@DisplayName("Record 2: State is FL")
	void StateOfRecord2() {
		assertEquals("FL", customers.get(1).getState());
	}

	@Test
	@DisplayName("Record 2: ZIP is 32347")
	void ZIPOfRecord2() {
		assertEquals("32347", customers.get(1).getZIP());
	}

	@Test
	@DisplayName("Record 2: Phone is 850-584-7434")
	void PhoneOfRecord2() {
		assertEquals("850-584-7434", customers.get(1).getPhone());
	}

	@Test
	@DisplayName("Record 2: Fax is 850-584-3364")
	void FaxOfRecord2() {
		assertEquals("850-584-3364", customers.get(1).getFax());
	}

	@Test
	@DisplayName("Record 2: Email is andrew@fenstermacher.com")
	void EmailOfRecord2() {
		assertEquals("andrew@fenstermacher.com", customers.get(1).getEmail());
	}

	@Test
	@DisplayName("Record 2: Web is http://www.andrewfenstermacher.com")
	void WebOfRecord2() {
		assertEquals("http://www.andrewfenstermacher.com", customers.get(1).getWeb());
	}
}
