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

@Tag("41")
class Record_2639 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2639: FirstName is Wilda")
	void FirstNameOfRecord2639() {
		assertEquals("Wilda", customers.get(2638).getFirstName());
	}

	@Test
	@DisplayName("Record 2639: LastName is Mcgafferty")
	void LastNameOfRecord2639() {
		assertEquals("Mcgafferty", customers.get(2638).getLastName());
	}

	@Test
	@DisplayName("Record 2639: Company is General Telco Federal Crdt Un")
	void CompanyOfRecord2639() {
		assertEquals("General Telco Federal Crdt Un", customers.get(2638).getCompany());
	}

	@Test
	@DisplayName("Record 2639: Address is 416 Penn Ave")
	void AddressOfRecord2639() {
		assertEquals("416 Penn Ave", customers.get(2638).getAddress());
	}

	@Test
	@DisplayName("Record 2639: City is Reading")
	void CityOfRecord2639() {
		assertEquals("Reading", customers.get(2638).getCity());
	}

	@Test
	@DisplayName("Record 2639: County is Berks")
	void CountyOfRecord2639() {
		assertEquals("Berks", customers.get(2638).getCounty());
	}

	@Test
	@DisplayName("Record 2639: State is PA")
	void StateOfRecord2639() {
		assertEquals("PA", customers.get(2638).getState());
	}

	@Test
	@DisplayName("Record 2639: ZIP is 19611")
	void ZIPOfRecord2639() {
		assertEquals("19611", customers.get(2638).getZIP());
	}

	@Test
	@DisplayName("Record 2639: Phone is 610-374-5065")
	void PhoneOfRecord2639() {
		assertEquals("610-374-5065", customers.get(2638).getPhone());
	}

	@Test
	@DisplayName("Record 2639: Fax is 610-374-2834")
	void FaxOfRecord2639() {
		assertEquals("610-374-2834", customers.get(2638).getFax());
	}

	@Test
	@DisplayName("Record 2639: Email is wilda@mcgafferty.com")
	void EmailOfRecord2639() {
		assertEquals("wilda@mcgafferty.com", customers.get(2638).getEmail());
	}

	@Test
	@DisplayName("Record 2639: Web is http://www.wildamcgafferty.com")
	void WebOfRecord2639() {
		assertEquals("http://www.wildamcgafferty.com", customers.get(2638).getWeb());
	}
}
