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

@Tag("28")
class Record_4622 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4622: FirstName is Concetta")
	void FirstNameOfRecord4622() {
		assertEquals("Concetta", customers.get(4621).getFirstName());
	}

	@Test
	@DisplayName("Record 4622: LastName is Ashbaugh")
	void LastNameOfRecord4622() {
		assertEquals("Ashbaugh", customers.get(4621).getLastName());
	}

	@Test
	@DisplayName("Record 4622: Company is Ragan, Dudley L Esq")
	void CompanyOfRecord4622() {
		assertEquals("Ragan, Dudley L Esq", customers.get(4621).getCompany());
	}

	@Test
	@DisplayName("Record 4622: Address is 5035 Gifford Ave")
	void AddressOfRecord4622() {
		assertEquals("5035 Gifford Ave", customers.get(4621).getAddress());
	}

	@Test
	@DisplayName("Record 4622: City is Los Angeles")
	void CityOfRecord4622() {
		assertEquals("Los Angeles", customers.get(4621).getCity());
	}

	@Test
	@DisplayName("Record 4622: County is Los Angeles")
	void CountyOfRecord4622() {
		assertEquals("Los Angeles", customers.get(4621).getCounty());
	}

	@Test
	@DisplayName("Record 4622: State is CA")
	void StateOfRecord4622() {
		assertEquals("CA", customers.get(4621).getState());
	}

	@Test
	@DisplayName("Record 4622: ZIP is 90058")
	void ZIPOfRecord4622() {
		assertEquals("90058", customers.get(4621).getZIP());
	}

	@Test
	@DisplayName("Record 4622: Phone is 323-277-4032")
	void PhoneOfRecord4622() {
		assertEquals("323-277-4032", customers.get(4621).getPhone());
	}

	@Test
	@DisplayName("Record 4622: Fax is 323-277-8666")
	void FaxOfRecord4622() {
		assertEquals("323-277-8666", customers.get(4621).getFax());
	}

	@Test
	@DisplayName("Record 4622: Email is concetta@ashbaugh.com")
	void EmailOfRecord4622() {
		assertEquals("concetta@ashbaugh.com", customers.get(4621).getEmail());
	}

	@Test
	@DisplayName("Record 4622: Web is http://www.concettaashbaugh.com")
	void WebOfRecord4622() {
		assertEquals("http://www.concettaashbaugh.com", customers.get(4621).getWeb());
	}
}
