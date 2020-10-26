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

@Tag("12")
class Record_3229 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3229: FirstName is Marvin")
	void FirstNameOfRecord3229() {
		assertEquals("Marvin", customers.get(3228).getFirstName());
	}

	@Test
	@DisplayName("Record 3229: LastName is Dibrito")
	void LastNameOfRecord3229() {
		assertEquals("Dibrito", customers.get(3228).getLastName());
	}

	@Test
	@DisplayName("Record 3229: Company is Fay Grimes & Gaeth Attorneys")
	void CompanyOfRecord3229() {
		assertEquals("Fay Grimes & Gaeth Attorneys", customers.get(3228).getCompany());
	}

	@Test
	@DisplayName("Record 3229: Address is 501 W 2nd St")
	void AddressOfRecord3229() {
		assertEquals("501 W 2nd St", customers.get(3228).getAddress());
	}

	@Test
	@DisplayName("Record 3229: City is Irving")
	void CityOfRecord3229() {
		assertEquals("Irving", customers.get(3228).getCity());
	}

	@Test
	@DisplayName("Record 3229: County is Dallas")
	void CountyOfRecord3229() {
		assertEquals("Dallas", customers.get(3228).getCounty());
	}

	@Test
	@DisplayName("Record 3229: State is TX")
	void StateOfRecord3229() {
		assertEquals("TX", customers.get(3228).getState());
	}

	@Test
	@DisplayName("Record 3229: ZIP is 75060")
	void ZIPOfRecord3229() {
		assertEquals("75060", customers.get(3228).getZIP());
	}

	@Test
	@DisplayName("Record 3229: Phone is 972-259-6278")
	void PhoneOfRecord3229() {
		assertEquals("972-259-6278", customers.get(3228).getPhone());
	}

	@Test
	@DisplayName("Record 3229: Fax is 972-259-7611")
	void FaxOfRecord3229() {
		assertEquals("972-259-7611", customers.get(3228).getFax());
	}

	@Test
	@DisplayName("Record 3229: Email is marvin@dibrito.com")
	void EmailOfRecord3229() {
		assertEquals("marvin@dibrito.com", customers.get(3228).getEmail());
	}

	@Test
	@DisplayName("Record 3229: Web is http://www.marvindibrito.com")
	void WebOfRecord3229() {
		assertEquals("http://www.marvindibrito.com", customers.get(3228).getWeb());
	}
}
