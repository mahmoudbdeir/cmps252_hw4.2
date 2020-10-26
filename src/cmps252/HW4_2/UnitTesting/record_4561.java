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

@Tag("7")
class Record_4561 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4561: FirstName is Arthur")
	void FirstNameOfRecord4561() {
		assertEquals("Arthur", customers.get(4560).getFirstName());
	}

	@Test
	@DisplayName("Record 4561: LastName is Nicolella")
	void LastNameOfRecord4561() {
		assertEquals("Nicolella", customers.get(4560).getLastName());
	}

	@Test
	@DisplayName("Record 4561: Company is Cerami Pontiac Gmc Truck Isuzu")
	void CompanyOfRecord4561() {
		assertEquals("Cerami Pontiac Gmc Truck Isuzu", customers.get(4560).getCompany());
	}

	@Test
	@DisplayName("Record 4561: Address is 1232 S La Cienega Blvd  #-204")
	void AddressOfRecord4561() {
		assertEquals("1232 S La Cienega Blvd  #-204", customers.get(4560).getAddress());
	}

	@Test
	@DisplayName("Record 4561: City is Los Angeles")
	void CityOfRecord4561() {
		assertEquals("Los Angeles", customers.get(4560).getCity());
	}

	@Test
	@DisplayName("Record 4561: County is Los Angeles")
	void CountyOfRecord4561() {
		assertEquals("Los Angeles", customers.get(4560).getCounty());
	}

	@Test
	@DisplayName("Record 4561: State is CA")
	void StateOfRecord4561() {
		assertEquals("CA", customers.get(4560).getState());
	}

	@Test
	@DisplayName("Record 4561: ZIP is 90035")
	void ZIPOfRecord4561() {
		assertEquals("90035", customers.get(4560).getZIP());
	}

	@Test
	@DisplayName("Record 4561: Phone is 310-659-6791")
	void PhoneOfRecord4561() {
		assertEquals("310-659-6791", customers.get(4560).getPhone());
	}

	@Test
	@DisplayName("Record 4561: Fax is 310-659-7413")
	void FaxOfRecord4561() {
		assertEquals("310-659-7413", customers.get(4560).getFax());
	}

	@Test
	@DisplayName("Record 4561: Email is arthur@nicolella.com")
	void EmailOfRecord4561() {
		assertEquals("arthur@nicolella.com", customers.get(4560).getEmail());
	}

	@Test
	@DisplayName("Record 4561: Web is http://www.arthurnicolella.com")
	void WebOfRecord4561() {
		assertEquals("http://www.arthurnicolella.com", customers.get(4560).getWeb());
	}
}
