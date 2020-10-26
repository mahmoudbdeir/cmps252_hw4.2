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
class Record_2823 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2823: FirstName is Marian")
	void FirstNameOfRecord2823() {
		assertEquals("Marian", customers.get(2822).getFirstName());
	}

	@Test
	@DisplayName("Record 2823: LastName is Phetsanghane")
	void LastNameOfRecord2823() {
		assertEquals("Phetsanghane", customers.get(2822).getLastName());
	}

	@Test
	@DisplayName("Record 2823: Company is Chung & Press Pc")
	void CompanyOfRecord2823() {
		assertEquals("Chung & Press Pc", customers.get(2822).getCompany());
	}

	@Test
	@DisplayName("Record 2823: Address is 38 College Dr")
	void AddressOfRecord2823() {
		assertEquals("38 College Dr", customers.get(2822).getAddress());
	}

	@Test
	@DisplayName("Record 2823: City is Jersey City")
	void CityOfRecord2823() {
		assertEquals("Jersey City", customers.get(2822).getCity());
	}

	@Test
	@DisplayName("Record 2823: County is Hudson")
	void CountyOfRecord2823() {
		assertEquals("Hudson", customers.get(2822).getCounty());
	}

	@Test
	@DisplayName("Record 2823: State is NJ")
	void StateOfRecord2823() {
		assertEquals("NJ", customers.get(2822).getState());
	}

	@Test
	@DisplayName("Record 2823: ZIP is 7305")
	void ZIPOfRecord2823() {
		assertEquals("7305", customers.get(2822).getZIP());
	}

	@Test
	@DisplayName("Record 2823: Phone is 201-333-7215")
	void PhoneOfRecord2823() {
		assertEquals("201-333-7215", customers.get(2822).getPhone());
	}

	@Test
	@DisplayName("Record 2823: Fax is 201-333-7587")
	void FaxOfRecord2823() {
		assertEquals("201-333-7587", customers.get(2822).getFax());
	}

	@Test
	@DisplayName("Record 2823: Email is marian@phetsanghane.com")
	void EmailOfRecord2823() {
		assertEquals("marian@phetsanghane.com", customers.get(2822).getEmail());
	}

	@Test
	@DisplayName("Record 2823: Web is http://www.marianphetsanghane.com")
	void WebOfRecord2823() {
		assertEquals("http://www.marianphetsanghane.com", customers.get(2822).getWeb());
	}
}
