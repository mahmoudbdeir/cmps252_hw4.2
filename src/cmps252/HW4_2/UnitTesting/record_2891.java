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

@Tag("32")
class Record_2891 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2891: FirstName is Pasquale")
	void FirstNameOfRecord2891() {
		assertEquals("Pasquale", customers.get(2890).getFirstName());
	}

	@Test
	@DisplayName("Record 2891: LastName is Kero")
	void LastNameOfRecord2891() {
		assertEquals("Kero", customers.get(2890).getLastName());
	}

	@Test
	@DisplayName("Record 2891: Company is Kyth R Jewell & Assocs Inc")
	void CompanyOfRecord2891() {
		assertEquals("Kyth R Jewell & Assocs Inc", customers.get(2890).getCompany());
	}

	@Test
	@DisplayName("Record 2891: Address is 3501 S Harrison St")
	void AddressOfRecord2891() {
		assertEquals("3501 S Harrison St", customers.get(2890).getAddress());
	}

	@Test
	@DisplayName("Record 2891: City is Fort Wayne")
	void CityOfRecord2891() {
		assertEquals("Fort Wayne", customers.get(2890).getCity());
	}

	@Test
	@DisplayName("Record 2891: County is Allen")
	void CountyOfRecord2891() {
		assertEquals("Allen", customers.get(2890).getCounty());
	}

	@Test
	@DisplayName("Record 2891: State is IN")
	void StateOfRecord2891() {
		assertEquals("IN", customers.get(2890).getState());
	}

	@Test
	@DisplayName("Record 2891: ZIP is 46807")
	void ZIPOfRecord2891() {
		assertEquals("46807", customers.get(2890).getZIP());
	}

	@Test
	@DisplayName("Record 2891: Phone is 260-744-7549")
	void PhoneOfRecord2891() {
		assertEquals("260-744-7549", customers.get(2890).getPhone());
	}

	@Test
	@DisplayName("Record 2891: Fax is 260-744-7363")
	void FaxOfRecord2891() {
		assertEquals("260-744-7363", customers.get(2890).getFax());
	}

	@Test
	@DisplayName("Record 2891: Email is pasquale@kero.com")
	void EmailOfRecord2891() {
		assertEquals("pasquale@kero.com", customers.get(2890).getEmail());
	}

	@Test
	@DisplayName("Record 2891: Web is http://www.pasqualekero.com")
	void WebOfRecord2891() {
		assertEquals("http://www.pasqualekero.com", customers.get(2890).getWeb());
	}
}
