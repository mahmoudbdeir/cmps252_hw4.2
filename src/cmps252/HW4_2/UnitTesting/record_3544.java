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

@Tag("33")
class Record_3544 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3544: FirstName is Brant")
	void FirstNameOfRecord3544() {
		assertEquals("Brant", customers.get(3543).getFirstName());
	}

	@Test
	@DisplayName("Record 3544: LastName is Baughan")
	void LastNameOfRecord3544() {
		assertEquals("Baughan", customers.get(3543).getLastName());
	}

	@Test
	@DisplayName("Record 3544: Company is Sute, Lisa S")
	void CompanyOfRecord3544() {
		assertEquals("Sute, Lisa S", customers.get(3543).getCompany());
	}

	@Test
	@DisplayName("Record 3544: Address is 1531 Frederica St")
	void AddressOfRecord3544() {
		assertEquals("1531 Frederica St", customers.get(3543).getAddress());
	}

	@Test
	@DisplayName("Record 3544: City is Owensboro")
	void CityOfRecord3544() {
		assertEquals("Owensboro", customers.get(3543).getCity());
	}

	@Test
	@DisplayName("Record 3544: County is Daviess")
	void CountyOfRecord3544() {
		assertEquals("Daviess", customers.get(3543).getCounty());
	}

	@Test
	@DisplayName("Record 3544: State is KY")
	void StateOfRecord3544() {
		assertEquals("KY", customers.get(3543).getState());
	}

	@Test
	@DisplayName("Record 3544: ZIP is 42301")
	void ZIPOfRecord3544() {
		assertEquals("42301", customers.get(3543).getZIP());
	}

	@Test
	@DisplayName("Record 3544: Phone is 270-684-2420")
	void PhoneOfRecord3544() {
		assertEquals("270-684-2420", customers.get(3543).getPhone());
	}

	@Test
	@DisplayName("Record 3544: Fax is 270-684-0095")
	void FaxOfRecord3544() {
		assertEquals("270-684-0095", customers.get(3543).getFax());
	}

	@Test
	@DisplayName("Record 3544: Email is brant@baughan.com")
	void EmailOfRecord3544() {
		assertEquals("brant@baughan.com", customers.get(3543).getEmail());
	}

	@Test
	@DisplayName("Record 3544: Web is http://www.brantbaughan.com")
	void WebOfRecord3544() {
		assertEquals("http://www.brantbaughan.com", customers.get(3543).getWeb());
	}
}
