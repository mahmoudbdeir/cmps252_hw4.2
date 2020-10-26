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
class Record_4105 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4105: FirstName is Angelia")
	void FirstNameOfRecord4105() {
		assertEquals("Angelia", customers.get(4104).getFirstName());
	}

	@Test
	@DisplayName("Record 4105: LastName is Vautier")
	void LastNameOfRecord4105() {
		assertEquals("Vautier", customers.get(4104).getLastName());
	}

	@Test
	@DisplayName("Record 4105: Company is Ocean County Empl Fed Crdt Un")
	void CompanyOfRecord4105() {
		assertEquals("Ocean County Empl Fed Crdt Un", customers.get(4104).getCompany());
	}

	@Test
	@DisplayName("Record 4105: Address is 21 Brookside Dr")
	void AddressOfRecord4105() {
		assertEquals("21 Brookside Dr", customers.get(4104).getAddress());
	}

	@Test
	@DisplayName("Record 4105: City is Wilmington")
	void CityOfRecord4105() {
		assertEquals("Wilmington", customers.get(4104).getCity());
	}

	@Test
	@DisplayName("Record 4105: County is New Castle")
	void CountyOfRecord4105() {
		assertEquals("New Castle", customers.get(4104).getCounty());
	}

	@Test
	@DisplayName("Record 4105: State is DE")
	void StateOfRecord4105() {
		assertEquals("DE", customers.get(4104).getState());
	}

	@Test
	@DisplayName("Record 4105: ZIP is 19804")
	void ZIPOfRecord4105() {
		assertEquals("19804", customers.get(4104).getZIP());
	}

	@Test
	@DisplayName("Record 4105: Phone is 302-655-6927")
	void PhoneOfRecord4105() {
		assertEquals("302-655-6927", customers.get(4104).getPhone());
	}

	@Test
	@DisplayName("Record 4105: Fax is 302-655-7867")
	void FaxOfRecord4105() {
		assertEquals("302-655-7867", customers.get(4104).getFax());
	}

	@Test
	@DisplayName("Record 4105: Email is angelia@vautier.com")
	void EmailOfRecord4105() {
		assertEquals("angelia@vautier.com", customers.get(4104).getEmail());
	}

	@Test
	@DisplayName("Record 4105: Web is http://www.angeliavautier.com")
	void WebOfRecord4105() {
		assertEquals("http://www.angeliavautier.com", customers.get(4104).getWeb());
	}
}
