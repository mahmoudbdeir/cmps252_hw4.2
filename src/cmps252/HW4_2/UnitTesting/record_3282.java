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
class Record_3282 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3282: FirstName is Lori")
	void FirstNameOfRecord3282() {
		assertEquals("Lori", customers.get(3281).getFirstName());
	}

	@Test
	@DisplayName("Record 3282: LastName is Krakowski")
	void LastNameOfRecord3282() {
		assertEquals("Krakowski", customers.get(3281).getLastName());
	}

	@Test
	@DisplayName("Record 3282: Company is Bala Nursing & Retirement Ctr")
	void CompanyOfRecord3282() {
		assertEquals("Bala Nursing & Retirement Ctr", customers.get(3281).getCompany());
	}

	@Test
	@DisplayName("Record 3282: Address is 1126 S Airport Rd")
	void AddressOfRecord3282() {
		assertEquals("1126 S Airport Rd", customers.get(3281).getAddress());
	}

	@Test
	@DisplayName("Record 3282: City is Peoria")
	void CityOfRecord3282() {
		assertEquals("Peoria", customers.get(3281).getCity());
	}

	@Test
	@DisplayName("Record 3282: County is Peoria")
	void CountyOfRecord3282() {
		assertEquals("Peoria", customers.get(3281).getCounty());
	}

	@Test
	@DisplayName("Record 3282: State is IL")
	void StateOfRecord3282() {
		assertEquals("IL", customers.get(3281).getState());
	}

	@Test
	@DisplayName("Record 3282: ZIP is 61605")
	void ZIPOfRecord3282() {
		assertEquals("61605", customers.get(3281).getZIP());
	}

	@Test
	@DisplayName("Record 3282: Phone is 309-697-7488")
	void PhoneOfRecord3282() {
		assertEquals("309-697-7488", customers.get(3281).getPhone());
	}

	@Test
	@DisplayName("Record 3282: Fax is 309-697-3008")
	void FaxOfRecord3282() {
		assertEquals("309-697-3008", customers.get(3281).getFax());
	}

	@Test
	@DisplayName("Record 3282: Email is lori@krakowski.com")
	void EmailOfRecord3282() {
		assertEquals("lori@krakowski.com", customers.get(3281).getEmail());
	}

	@Test
	@DisplayName("Record 3282: Web is http://www.lorikrakowski.com")
	void WebOfRecord3282() {
		assertEquals("http://www.lorikrakowski.com", customers.get(3281).getWeb());
	}
}
