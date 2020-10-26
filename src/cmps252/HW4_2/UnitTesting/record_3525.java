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

@Tag("2")
class Record_3525 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3525: FirstName is Merrill")
	void FirstNameOfRecord3525() {
		assertEquals("Merrill", customers.get(3524).getFirstName());
	}

	@Test
	@DisplayName("Record 3525: LastName is Ramberg")
	void LastNameOfRecord3525() {
		assertEquals("Ramberg", customers.get(3524).getLastName());
	}

	@Test
	@DisplayName("Record 3525: Company is Industrial Heating Supply Corp")
	void CompanyOfRecord3525() {
		assertEquals("Industrial Heating Supply Corp", customers.get(3524).getCompany());
	}

	@Test
	@DisplayName("Record 3525: Address is 1771 W Diehl Rd  #-210")
	void AddressOfRecord3525() {
		assertEquals("1771 W Diehl Rd  #-210", customers.get(3524).getAddress());
	}

	@Test
	@DisplayName("Record 3525: City is Naperville")
	void CityOfRecord3525() {
		assertEquals("Naperville", customers.get(3524).getCity());
	}

	@Test
	@DisplayName("Record 3525: County is DuPage")
	void CountyOfRecord3525() {
		assertEquals("DuPage", customers.get(3524).getCounty());
	}

	@Test
	@DisplayName("Record 3525: State is IL")
	void StateOfRecord3525() {
		assertEquals("IL", customers.get(3524).getState());
	}

	@Test
	@DisplayName("Record 3525: ZIP is 60563")
	void ZIPOfRecord3525() {
		assertEquals("60563", customers.get(3524).getZIP());
	}

	@Test
	@DisplayName("Record 3525: Phone is 630-305-8279")
	void PhoneOfRecord3525() {
		assertEquals("630-305-8279", customers.get(3524).getPhone());
	}

	@Test
	@DisplayName("Record 3525: Fax is 630-305-8844")
	void FaxOfRecord3525() {
		assertEquals("630-305-8844", customers.get(3524).getFax());
	}

	@Test
	@DisplayName("Record 3525: Email is merrill@ramberg.com")
	void EmailOfRecord3525() {
		assertEquals("merrill@ramberg.com", customers.get(3524).getEmail());
	}

	@Test
	@DisplayName("Record 3525: Web is http://www.merrillramberg.com")
	void WebOfRecord3525() {
		assertEquals("http://www.merrillramberg.com", customers.get(3524).getWeb());
	}
}
