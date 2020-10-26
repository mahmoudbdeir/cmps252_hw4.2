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
class Record_3181 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3181: FirstName is Hector")
	void FirstNameOfRecord3181() {
		assertEquals("Hector", customers.get(3180).getFirstName());
	}

	@Test
	@DisplayName("Record 3181: LastName is Delaroca")
	void LastNameOfRecord3181() {
		assertEquals("Delaroca", customers.get(3180).getLastName());
	}

	@Test
	@DisplayName("Record 3181: Company is Print Shop")
	void CompanyOfRecord3181() {
		assertEquals("Print Shop", customers.get(3180).getCompany());
	}

	@Test
	@DisplayName("Record 3181: Address is 1250 Albert St")
	void AddressOfRecord3181() {
		assertEquals("1250 Albert St", customers.get(3180).getAddress());
	}

	@Test
	@DisplayName("Record 3181: City is Youngstown")
	void CityOfRecord3181() {
		assertEquals("Youngstown", customers.get(3180).getCity());
	}

	@Test
	@DisplayName("Record 3181: County is Mahoning")
	void CountyOfRecord3181() {
		assertEquals("Mahoning", customers.get(3180).getCounty());
	}

	@Test
	@DisplayName("Record 3181: State is OH")
	void StateOfRecord3181() {
		assertEquals("OH", customers.get(3180).getState());
	}

	@Test
	@DisplayName("Record 3181: ZIP is 44505")
	void ZIPOfRecord3181() {
		assertEquals("44505", customers.get(3180).getZIP());
	}

	@Test
	@DisplayName("Record 3181: Phone is 330-744-6170")
	void PhoneOfRecord3181() {
		assertEquals("330-744-6170", customers.get(3180).getPhone());
	}

	@Test
	@DisplayName("Record 3181: Fax is 330-744-2701")
	void FaxOfRecord3181() {
		assertEquals("330-744-2701", customers.get(3180).getFax());
	}

	@Test
	@DisplayName("Record 3181: Email is hector@delaroca.com")
	void EmailOfRecord3181() {
		assertEquals("hector@delaroca.com", customers.get(3180).getEmail());
	}

	@Test
	@DisplayName("Record 3181: Web is http://www.hectordelaroca.com")
	void WebOfRecord3181() {
		assertEquals("http://www.hectordelaroca.com", customers.get(3180).getWeb());
	}
}
